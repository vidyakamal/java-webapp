package com.norwood.grpc.greeting.client;

import com.proto.sum.SumRequest;
import com.proto.sum.SumResponse;
import com.proto.sum.SumServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SumClient {
    public static void main(String []args)  {
        System.out.println("Hello from client");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052).usePlaintext()
                .build();
        SumServiceGrpc.SumServiceBlockingStub sumServiceBlockingStub = SumServiceGrpc.newBlockingStub(channel);
      //  SumRequest sumRequest = SumRequest.newBuilder().setNum1(10).setNum2(12).build();
     //   SumResponse sumResponse = sumServiceBlockingStub.sum(sumRequest);
     //   System.out.println(sumResponse.getSum());

        System.out.println("shutting down channel");
        channel.shutdown();
    }
}
