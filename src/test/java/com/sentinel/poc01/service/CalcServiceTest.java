package com.sentinel.poc01.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalcServiceTest {

    @InjectMocks
    CalcService calcService;

    @Test
    public void shoudPerformAddition(){
        Double ammount1 = 1.0;
        Double ammount2 = 1.0;
        Double result = calcService.sum(ammount1, ammount2);
        assertEquals(2.0, result);
    }

}
