package com.sentinel.poc01.service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public Double sum(Double ammount1, Double ammount2) {
        return ammount1 + ammount2;
    }

}
