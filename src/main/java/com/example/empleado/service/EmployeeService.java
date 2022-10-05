
package com.example.empleado.service;

import com.example.empleado.entity.Employee;
import java.util.List;


public interface EmployeeService {//se definen los metodos CRUD
    //CREATE
    public Employee createEmployee(Employee e);
    
    //READ
    public List<Employee> getEmployees();
    
    //DELETE
    public void deleteEmployee(long idEmp);
    
    //UPDATE
    public Employee updateEmployee(Long idEmp, Employee e);
    
}
