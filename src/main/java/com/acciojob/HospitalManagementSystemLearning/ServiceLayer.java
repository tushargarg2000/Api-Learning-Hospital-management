package com.acciojob.HospitalManagementSystemLearning;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayer {

    RepositoryLayer repositoryLayerObj = new RepositoryLayer();
    public String addPatient(Patient patient) {
        String response = repositoryLayerObj.addPatient(patient);
        return response;
    }

    public Patient getPatient(String name,String mobileNo){

        List<Patient> patientList = repositoryLayerObj.getAllPatients();

        for(Patient patient : patientList){
            if(patient.getPatientName().equals(name) &&
               patient.getMobNo().equals(mobileNo))
            {
                return patient;
            }
        }
        return null;
    }

    public String getOldestPatientName() {

        List<Patient> patientList = repositoryLayerObj.getAllPatients();

        int maxAge = 0;
        Patient ansPatient = null;
        for(Patient patient: patientList){

            if(patient.getPatientAge()> maxAge){
                maxAge = patient.getPatientAge();
                ansPatient = patient;
            }
        }
        return ansPatient.getPatientName();
    }
}
