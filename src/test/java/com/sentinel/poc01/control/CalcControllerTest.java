package com.sentinel.poc01.control;


import com.sentinel.poc01.service.CalcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalcControllerTest {

    @Mock
    CalcService calcService;

    @InjectMocks
    CalcController calcController;

    @Test
    public void shouldCallCalcService() {
        Double ammount1 = 1.0;
        Double ammount2 = 1.0;
        when(calcService.sum(anyDouble(), anyDouble())).thenReturn(0.0);
        calcController.sum(ammount1, ammount2);
        verify(calcService, times(1)).sum(ammount1, ammount2);
    }

}
