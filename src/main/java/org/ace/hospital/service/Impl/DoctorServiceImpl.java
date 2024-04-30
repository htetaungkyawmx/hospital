package org.ace.hospital.service.Impl;

import org.ace.hospital.entity.Doctor;
import org.ace.hospital.repo.DoctorRepo;
import org.ace.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    @Override
    public void save(Doctor doctor) {
        doctorRepo.save(doctor);
    }
}
