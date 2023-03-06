package com.geekster.DoctorApplication.service;

import com.geekster.DoctorApplication.dao.PatientRepository;
import com.geekster.DoctorApplication.model.Patient;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository repository;

    public void savePatient(Patient patient) {

        repository.save(patient);
    }

    public JSONArray getPatients(String doctorId, String patientId) {
        JSONArray jsonArray = new JSONArray();
        List<Patient> patientList = new ArrayList<>();
        if(patientId == null && doctorId !=null){
            List<Patient> allList = repository.findAll();
            for(Patient patient:allList){
                if(patient.getDoctorId().getDoctorId()==Integer.parseInt(doctorId)){
                    patientList.add(patient);
                }
            }
        }
        else if(doctorId ==null && patientId != null){
            List<Patient> allList = repository.findAll();
            for(Patient patient:allList){
                if(patient.getPatientId()== Integer.parseInt(patientId)){
                    patientList.add(patient);
                }
            }
        }
        else{
            patientList = repository.findAll();
        }
        for(Patient patient : patientList){
            jsonArray.put(generateResponse(patient));
        }
        return jsonArray;
    }

    private JSONObject generateResponse(Patient patient) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patientId",patient.getPatientId());
        jsonObject.put("patientName",patient.getPatientName());
        jsonObject.put("age",patient.getAge());
        jsonObject.put("gender",patient.getGender());
        jsonObject.put("admitDate",patient.getAdmitDate());
        jsonObject.put("diseaseType",patient.getDiseaseType());
        jsonObject.put("phoneNumber",patient.getPhoneNumber());
        jsonObject.put("doctorId",patient.getDoctorId());
        return jsonObject;
    }
}
