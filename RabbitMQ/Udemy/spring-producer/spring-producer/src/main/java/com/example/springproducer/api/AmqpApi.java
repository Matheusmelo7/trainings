package com.example.springproducer.api;

import com.example.springproducer.dto.Message;
import com.example.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AmqpApi {

    @Autowired
    private AmqpService amqpService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping("/send")
    public void sendToConsumer(@RequestBody Message message){

        amqpService.sendToConsumer(message);
    }


}
