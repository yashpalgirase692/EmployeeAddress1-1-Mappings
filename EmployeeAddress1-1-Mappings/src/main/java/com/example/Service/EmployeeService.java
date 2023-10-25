package com.example.Service;

import com.example.Entity.Employee;
import com.example.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public Iterable<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee added successfully..";
    }

    public String updateEmployeeById(Long id, String lastName) {
        Optional<Employee> optional = employeeRepo.findById(id);

        if(optional.isPresent()){
            Employee employee = optional.get();
            employee.setLastName(lastName);
            employeeRepo.save(employee);
        }else{
            return "Id not found..";
        }
        return "Employee added successfully..";
    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "Employee removed successfully..";
    }
}