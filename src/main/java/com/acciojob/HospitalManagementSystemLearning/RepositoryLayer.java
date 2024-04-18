package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryLayer {

    Map<Integer,Patient> patientDb = new HashMap<>();
    //This is the Database Layer

    public String addPatient(Patient patient){

        int key = patient.getPatientId();
        //Add this to the patient DB
        patientDb.put(key,patient);

        return "The patient with patientId"+key+" has been saved to DB";
    }

    public List<Patient> getAllPatients(){

        List<Patient> patients = new ArrayList<>();
        for(Patient patient:patientDb.values()){
            patients.add(patient);
        }
        return patients;
    }







}
