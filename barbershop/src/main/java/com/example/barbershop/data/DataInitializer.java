package com.example.barbershop.data;

import com.example.barbershop.model.*;
import com.example.barbershop.repository.EmployeeRepository;
import com.example.barbershop.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public void run(String... args) {
        if (employeeRepository.count() == 0) {
            employeeRepository.save(new Employee("Ali.benkirane@gmail.com", "Ali", "Benkirane", "Ali123", "img/team/1.png"));
            employeeRepository.save(new Employee("Said.malki@gmail.com", "Said", "Malki", "said123", "img/team/2.png"));
            employeeRepository.save(new Employee("Hamid.Bellouze@gmail.com", "Hamid", "Bellouze", "hamid123", "img/team/3.png"));
        }

        if (serviceRepository.count() == 0) {
            serviceRepository.save(new Service("Experience a smooth and comfortable shave.", 15, 109.9, "img/service/1.png", "Smooth Shave"));
            serviceRepository.save(new Service("Precision trimming for a well-groomed look.", 30, 150, "img/service/2.png", "Beard Trimming"));
            serviceRepository.save(new Service("Various stylish cuts to suit your face.", 45, 200, "img/service/3.png", "Haircut Styles"));
        }
    }
}