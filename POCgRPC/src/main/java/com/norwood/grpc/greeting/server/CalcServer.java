package com.norwood.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class SumServer {
    public static void main(String args[]) throws IOException, InterruptedException {

        System.out.println("Sum Server");

        Server server = ServerBuilder.forPort(50052).addService(new SumServerImpl()).build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("Received shutdown notification");
            server.shutdown();
            System.out.println("shut down success");
        }
        ));

        server.awaitTermination();

    }
}
