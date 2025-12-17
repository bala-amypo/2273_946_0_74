package com.example.demo.entity;

import jakarta.persistance.*;
public class Student{
    private long id;
    private String name;
    private String email;
    private float cgpa;
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public float getCgpa(){
          return  cgpa;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public Student(int id, String name, String email, float cgpa, String course) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.cgpa = cgpa;
      this.course = course;
  }
}