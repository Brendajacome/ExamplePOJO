/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojo.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class User {
    public static void main(String[] args) {
        
        List<StudentsPOJO> studentsList = new ArrayList<>();
        
        StudentsPOJO obj1 = new StudentsPOJO();
        obj1.setName("Sofia");
        obj1.setLastName("Rodriguez");
        obj1.setStartDate(LocalDate.now());
        studentsList.add(obj1);
        
        StudentsPOJO obj2 = new StudentsPOJO();
        obj2.setName("Francisco");
        obj2.setLastName("Gonzales");
        obj2.setStartDate(LocalDate.now());
        studentsList.add(obj2);
        
        for (StudentsPOJO student : studentsList) {
            System.out.println(student.getFullName() + " " + student.getStartDate());   
        }
    }
   
}
