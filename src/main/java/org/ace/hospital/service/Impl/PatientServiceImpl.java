package org.ace.hospital.service.Impl;

import org.ace.hospital.entity.Doctor;
import org.ace.hospital.entity.Patient;
import org.ace.hospital.repo.DoctorRepo;
import org.ace.hospital.repo.PatientRepo;
import org.ace.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Override
    public void save(Patient patient) {
        patientRepo.save(patient);
    }
}