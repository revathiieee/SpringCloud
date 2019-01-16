package com.spring.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MessageResource {

    @Value("${message :Default Hello}")
    private String message;

    @GetMapping("/message")
    public String getMessageProperty(){
        return message;
    }
}
