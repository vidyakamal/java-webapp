package com.norwood.grpc.greeting.server;

import com.proto.sum.*;
import io.grpc.stub.StreamObserver;

public class SumServerImpl extends SumServiceGrpc.SumServiceImplBase {
    @Override
    public void primeDecomp(primeDecompRequest request, StreamObserver<primeDecompResponse> responseObserver) {
        int k = 2;
        int N = request.getNum();

        while (N > 1) {
            if (N % k == 0) {   // if k evenly divides into N
                primeDecompResponse decompResponse = primeDecompResponse.newBuilder().
                        setPrimefactor(k).build();
                responseObserver.onNext(decompResponse);
                N = N / k;
            }// divide N by k so that we have the rest of the number left.
    else {
                k = k + 1;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int sum = request.getNum1()+request.getNum2();
        SumResponse sumResponse = SumResponse.newBuilder().setSum(sum).build();
        responseObserver.onNext(sumResponse);
        responseObserver.onCompleted();
    }
}
