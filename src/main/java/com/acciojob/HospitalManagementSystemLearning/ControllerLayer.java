package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {

    @Autowired
    ServiceLayer serviceLayerObj;

    @PostMapping("addPatient")
    public String addPatient(@RequestBody Patient patient) {

        //This layer will only take care of the endpoint
        String response = serviceLayerObj.addPatient(patient);
        return response;
    }

    @GetMapping("/getPatient/{name}/{mobNo}")
    public Patient getPatientInfo(@PathVariable("name")String name,
                                  @PathVariable("mobNo")String mobNo){

        Patient patient = serviceLayerObj.getPatient(name,mobNo);

        System.out.println(patient); // what will be output

        return patient;
    }




    @GetMapping("/getPatientByNameAndMobNo")
    public Patient getPatientByNameAndMobNo(@RequestParam("name")String name,
                                            @RequestParam("mobNo")String mobNo) {

        Patient patient = serviceLayerObj.getPatient(name,mobNo);
        return patient;
    }

    @GetMapping("/findOldestPatientName")
    public String findOldestPatientName() {

        String patientName = serviceLayerObj.getOldestPatientName();
        return patientName;

    }

}
