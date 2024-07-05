package pojo.example;

import java.time.LocalDate;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class StudentsPOJO {
    private String name;
    private String lastName;
    private LocalDate startDate;
 
    // Constructor sin argumentos
    public StudentsPOJO() {
    }
 
    // Constructor con argumentos
    public StudentsPOJO(String name, String lastName, LocalDate startDate) {
        this.name = name;
        this.lastName = lastName;
        this.startDate = startDate;
    }
 
    public String getFullName() {
        return this.name + " " + this.lastName;
    }
 
    public LocalDate getStartDate() {
        return this.startDate;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
 
}
