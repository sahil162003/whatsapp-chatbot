package com.sc.controller;

import com.sc.dto.Whatsdto;
import com.sc.service.ChatbotService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api",produces = MediaType.APPLICATION_JSON_VALUE)
public class WebhookController {
    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    private final ChatbotService chatbotService;
   @PostMapping("/webhook")
    public String  reciveMesssage(@RequestBody Whatsdto whatsdto){
       logger.info("Message from [{}]: {}", whatsdto.getSender(), whatsdto.getMessage());
       String reply = chatbotService.getReply(whatsdto.getMessage());

       return reply;
   }
}
