package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "Customer",
        description = "Schema to hold Customer and Account Information")
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",example = "Yousef")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Name must be between 5 and 30 characters")
    private String name;

    @Schema(
            description = "Email of the Customer",example ="yousef@gmail.com")
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile Number of the Customer",example = "9876543210")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be a 10-digits number")
    private String mobileNumber;

    @Schema(
            description = "Account Information of the Customer")
    private AccountsDto accountsDto;
}
