package com.springcloudproducerrest.producer.Resource;

import com.springcloudproducerrest.producer.DTO.Message;
import com.springcloudproducerrest.producer.DTO.Product;
import com.springcloudproducerrest.producer.Message.RestProducer;
import com.springcloudproducerrest.producer.Message.RestSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    private RestSource restSource;

    @Autowired
    private RestProducer restProducer;

    @PostMapping("/process")
    public ResponseEntity<Message> processProduct(@RequestBody Product product) {

        boolean result = restProducer.sendMessageProduct(product, restSource);

        Message messageResult = new Message("Operacao realizada com sucesso? "+result);
        return ResponseEntity.ok(messageResult);

    }

}
