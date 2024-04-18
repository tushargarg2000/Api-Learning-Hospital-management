package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("patient")
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
    public ResponseEntity addPatient(@RequestBody Patient patient) {

        int key = patient.getPatientId();
        //Add this to the patient DB
        patientDb.put(key,patient);

        String result = "The patient with patientId"+key+" has been saved to DB";

        return new ResponseEntity(result, HttpStatus.CREATED);
    }

    @GetMapping("getPatientInfo")
    public ResponseEntity getPatientInfo(@RequestParam("patientIdEnterInformation")Integer patientId){

        //patientId is acting as the key
        Patient patient = patientDb.get(patientId);

        return new ResponseEntity(patient,HttpStatus.EXPECTATION_FAILED);
    }

    @GetMapping("/getPatientByNameAndMobNo")
    public Patient getPatientByNameAndMobNo(@RequestParam("name")String name,
                                            @RequestParam("mobNo")String mobNo){

        for(Patient patient: patientDb.values()) {
            if(patient.getPatientName().equals(name) &&
               patient.getMobNo().equals(mobNo)){
                return patient;
            }
        }
        return null;
    }

    @GetMapping("/findOldestPatientName")
    public String findOldestPatient(){

        //return name of the oldest patient
        //present in the DB.
        int maxAge = 0;
        Patient ansPatient = null;
        for(Patient patient: patientDb.values()){

            if(patient.getPatientAge()> maxAge){
                maxAge = patient.getPatientAge();
                ansPatient = patient;
            }
        }
        return ansPatient.getPatientName();
    }

    @DeleteMapping("deletePatientRecord")
    public String deletePatientFromDb(@RequestParam("patientId")Integer patientId) {
        patientDb.remove(patientId);
        return "The patient has been removed from DB";
    }
    //Update mobile no. and Age
}
