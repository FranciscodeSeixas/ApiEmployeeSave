
package com.example.empleado.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity //Indica que tiee que mapear con una tabala de la base de datos
@Table(name = "employee") //opcinal, si no se pone toma el nombre de la clase
public class Employee {
  @Id //indica que el atributo es la clave primaria
  @GeneratedValue(strategy = GenerationType.IDENTITY) //incremento automatico
  @Column (name = "emp_id")
  private long id; 
           
  @Column(name = "first_name") //nombre de la columna, si no toma el nombre del atributo
  private String firstName;
  
  @Column(name = "last_name")
  private String lastName;
  
  @Column(name = "email_id")
  private String emailId;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

  
  
}
