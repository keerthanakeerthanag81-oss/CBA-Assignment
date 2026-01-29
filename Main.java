package com.hospital.management;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Hospital Management System");

        Patient patient = new Patient(101, "ramesh", 22);
        Doctor doctor = new Doctor(201, "Dr. Anjali", "Dermatologists");

        patient.displayPatientInfo();
        doctor.displayDoctorInfo();
    }
}

