package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(name = "Accounts",
        description = "Schema to hold Account Information")
public class AccountsDto {

    @Schema(
            description = "Account Number of the Customer", example = "3454433243")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Account number must be a 10-digit number")
    private Long accountNumber;

    @Schema(
            description = "Account type of the Customer", example = "Savings")
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Bank branch address", example = "123 New York")
    private String branchAddress;
}
