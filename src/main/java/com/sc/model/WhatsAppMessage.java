package com.sc.model;



import lombok.Data;

import java.time.LocalDateTime;

@Data

public class WhatsAppMessage {

    private Long id;
    private String sender;
    private String message;
    private String reply;
    private LocalDateTime timestamp = LocalDateTime.now();

}
