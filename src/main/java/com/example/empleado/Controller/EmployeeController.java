
package com.example.empleado.Controller;

import com.example.empleado.entity.Employee;
import com.example.empleado.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    
    @GetMapping("/employees")
    public List<Employee> readEmployee(){
        return employeeService.getEmployees();
    }
    
    @PutMapping("/employees/{id}")
     public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id){
         return employeeService.updateEmployee(id, employee);
     }
                
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
    
}
