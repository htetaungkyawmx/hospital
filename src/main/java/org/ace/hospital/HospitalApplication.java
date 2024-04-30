package org.ace.hospital;

import org.ace.hospital.entity.Doctor;
import org.ace.hospital.entity.Patient;
import org.ace.hospital.repo.DoctorRepo;
import org.ace.hospital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {
    @Autowired
    private DoctorRepo doctorRepo;

    @Autowired
    private PatientRepo patientRepo;

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Doctor doctor = new Doctor();
        doctor.setName("Dr.Sai Lon");
        doctor.setDob(LocalDateTime.of(1999, 1, 1, 0, 0));
        doctor.setAddress(("Shan North"));

        doctorRepo.save(doctor);


        Patient patient = new Patient();
        patient.setName("MX");
        patient.setDob(LocalDateTime.of(2000, 1, 1, 0, 0));
        patient.setAddress("Shan South");
        patient.setDoctor(doctor);

        patientRepo.save(patient);

    }

}