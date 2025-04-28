package com.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.DataTruncation;

@Data
public class CardDTO {
    private String id;
    private String pan;
    private Long balance;

}
