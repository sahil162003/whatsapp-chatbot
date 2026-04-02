package com.sc.service;

import com.sc.dto.Whatsdto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatbotService {

    public String getReply(Whatsdto messages) {
 String message = messages.getMessage();

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


