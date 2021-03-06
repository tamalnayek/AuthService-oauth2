package com.mykbox.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class TokenRequest {

    @NotNull(message = "Malformed request, could not parse or validate JSON object.")
    private String email;
}
