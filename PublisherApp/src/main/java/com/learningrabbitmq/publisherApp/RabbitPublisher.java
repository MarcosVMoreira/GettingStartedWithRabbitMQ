package com.learningrabbitmq.publisherApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
public class RabbitPublisher {

    @Autowired
    private Source source;

    @GetMapping(value = "/api/publish")
    public void sendMessage () {
        Message message = new Message("Hello from publisher");

        source.output().send(MessageBuilder.withPayload(message).build());
    }

}
