package com.sc.service;

import com.sc.dto.Whatsdto;
import com.sc.model.WhatsAppMessage;
import com.sc.reposistory.ChatBotRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatbotService {
private final ChatBotRepo chatBotRepo;

    public String getReply(Whatsdto messages) {
 String message = messages.getMessage();
 String reply;
        switch (message.trim().toLowerCase()) {
            case "hi":
            case "hello":
                reply= "Hello! How can I help you?";
                break;
            case "bye":
            case "goodbye":
                reply= "Goodbye! Have a great day!";
                break;
            default:
                reply= "I didn't understand that. Try saying Hi or Bye.";
                break;

        }
        WhatsAppMessage chatMessage= new WhatsAppMessage();
        chatMessage.setMessage(messages.getMessage());
        chatMessage.setSender(messages.getSender());
        chatMessage.setReply(reply);
        chatBotRepo.save(chatMessage);
    return reply;
    }



}


