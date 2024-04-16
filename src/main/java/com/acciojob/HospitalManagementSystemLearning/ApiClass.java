package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiClass {

    @GetMapping("getWeatherInfo")
    public String getWeatherInformationPlusPlus() {

        return "The temperature is 30C, and feels like 35, the winds are" +
                " running at 10kmp, humidity 65%";
    }

    @GetMapping("sum")
    public String getSum(@RequestParam("no1")Integer no1,
                         @RequestParam("no2")Integer no2){

        Integer sum = no1+no2;

        return "The sum of numbers entered is "+sum;
    }


}
