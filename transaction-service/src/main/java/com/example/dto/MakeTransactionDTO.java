package com.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MakeTransactionDTO {
    private String fromCardNumber;
    private String toCardNumber;
    private Long amount;
}
