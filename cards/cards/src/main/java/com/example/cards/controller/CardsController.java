package com.example.cards.controller;

import com.example.cards.model.Cards;
import com.example.cards.model.Customer;
import com.example.cards.repository.CardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardsController {

    private final CardsRepository cardsRepository;

    @Autowired
    public CardsController(CardsRepository cardsRepository) {
        this.cardsRepository = cardsRepository;
    }

    @PostMapping("/myCards")
    public List<Cards> getCardDetail(@RequestBody Customer customer){
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        if(cards!=null){
            return cards;
        }else{
            return null;
        }
    }
}
