package com.spring.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class MessageResource {

    @Value("${message: Config server is down. Sorry for inconvenience..!}")
    private String message;

    @GetMapping("/message")
    public String getMessageProperty(){
        return message;
    }
}
