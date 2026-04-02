package com.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sc")

public class WhatsappChatbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhatsappChatbotApplication.class, args);
    }

}
