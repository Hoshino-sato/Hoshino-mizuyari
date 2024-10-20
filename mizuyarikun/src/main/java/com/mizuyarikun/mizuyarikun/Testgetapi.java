package com.mizuyarikun.mizuyarikun;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Testgetapi {

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {

        System.out.println(param);

        return new String();
    }
    

    
}
