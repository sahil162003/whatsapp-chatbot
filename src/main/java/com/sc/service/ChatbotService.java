package com.sc.service;

import com.sc.dto.Whatsdto;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {


    public String getReply(String message) {

        switch (message.trim().toLowerCase()) {
            case "hi":
            case "hello":
                return "Hello! How can I help you?";
            case "bye":
            case "goodbye":
                return "Goodbye! Have a great day!";
            default:
                return "I didn't understand that. Try saying Hi or Bye.";
        }
    }



}


