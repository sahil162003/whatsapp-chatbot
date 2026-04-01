package com.sc.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class Whatsdto {

    private String sender;
    @NotBlank(message = "Password is required")

    private String message;
}
