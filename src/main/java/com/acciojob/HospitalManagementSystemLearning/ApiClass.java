package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiClass {

    Map<Integer,Patient> patientDb = new HashMap<>();

    @GetMapping("getWeatherInfo/today")
    public String getWeatherInformationPlusPlus() {

        return "The temperature is 30C, and feels like 35, the winds are" +
                " running at 10kmp, humidity 65%";
    }

    @GetMapping("sum")
    public String getSum(@RequestParam("no1")int no1,
                         @RequestParam("no2")int no2){

        Integer sum = no1+no2;

        return "The sum of numbers entered is "+sum;
    }

    @PostMapping("addPatient")
    public String addPatient(@RequestBody Patient patient) {

        int key = patient.getPatientId();
        //Add this to the patient DB
        patientDb.put(key,patient);

        return "The patient with patientId"+key+" has been saved to DB";

    }

    @GetMapping("getPatientInfo")
    public Patient getPatientInfo(@RequestParam("patientIdEnterInformation")Integer patientId){

        //patientId is acting as the key
        Patient patient = patientDb.get(patientId);
        return patient;
    }


}
