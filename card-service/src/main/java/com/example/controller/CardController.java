package com.example.controller;

import com.example.dto.CardDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/card")
public class CardController {

    @GetMapping("/{pan}")
    public ResponseEntity<?> getById(@PathVariable("pan") String pan) {
        CardDTO dto=new CardDTO();
        dto.setId(UUID.randomUUID().toString());
        dto.setPan(pan);
        dto.setBalance(1000L);
        return ResponseEntity.ok(dto);
    }
}
