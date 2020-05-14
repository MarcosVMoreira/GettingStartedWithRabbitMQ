package com.springcloud.consumer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class MyConsumer {

    @StreamListener(Sink.INPUT)
    public void readMessage (String message) {
        System.out.println("New message: " + message);
    }

}
