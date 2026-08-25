package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(description = "API path invoked by client", example = "uri=/api/example")
    private String apiPath;

    @Schema(description = "Error code representing the error happened", example = "500 INTERNAL_SERVER_ERROR")
    private HttpStatus errorCode;

    @Schema(description = "Error message describing the error happened", example = "Internal Server Error")
    private String errorMsg;

    private LocalDateTime errorTime;
}
