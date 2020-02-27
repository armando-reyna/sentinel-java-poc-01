package com.sentinel.poc01.control;

import com.sentinel.poc01.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @Autowired
    private CalcService calcService;

    @GetMapping("/sum")
    public Double sum(@RequestParam(name = "ammount1") Double ammount1, @RequestParam(name = "ammount2") Double ammount2){
        return calcService.sum(ammount1, ammount2);
    }

}
