
package com.example.empleado.service;

import com.example.empleado.entity.Employee;
import com.example.empleado.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRespository;
    //CREATE
    @Override
    public Employee createEmployee(Employee e) {
        return employeeRespository.save(e);
    }
    //READ
    @Override
    public List<Employee> getEmployees() {
        return employeeRespository.findAll();
    }
    //DELETE
    @Override
    public void deleteEmployee(long idEmp) {
        employeeRespository.deleteById(idEmp);
    }
    //UPDATE
    @Override
    public Employee updateEmployee(Long idEmp, Employee e) {
        Employee employee = employeeRespository.findById(idEmp).get();
        employee.setFirstName(e.getFirstName());
        employee.setLastName(e.getLastName());
        employee.setEmailId(e.getEmailId());
        
        return employeeRespository.save(employee);
        
    }
    
}
