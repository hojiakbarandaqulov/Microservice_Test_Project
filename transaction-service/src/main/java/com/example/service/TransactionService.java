package com.example.service;

import com.example.dto.CardDTO;
import com.example.dto.MakeTransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class TransactionService {

//    private String cardServerUrl = "http://localhost:8081/card";
    private final RestTemplate restTemplate;

    public TransactionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<CardDTO> makeTransaction(MakeTransactionDTO dto) {
        //check cardEntity
        CardDTO fromCard=getCardByPan(dto.getFromCardNumber());
        CardDTO cardTo=getCardByPan(dto.getToCardNumber());
        return null;
    }

    public CardDTO getCardByPan(String pan) {
        ResponseEntity<CardDTO> response
                = restTemplate.getForEntity("https://card-service/card" + "/" + pan, CardDTO.class);
        return response.getBody();
    }
}
