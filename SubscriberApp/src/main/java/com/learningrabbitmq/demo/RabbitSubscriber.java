package com.learningrabbitmq.demo;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class RabbitSubscriber {

    @StreamListener(Sink.INPUT)
    public void handleMessage(Message message) {
        System.out.println("Received message is: "+message);
    }

}
