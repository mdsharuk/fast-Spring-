package com.example.springBoot.SpringBoot.Model;



import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate localDate;
    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate localDate, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.localDate = localDate;
        this.age = age;
    }

    public Student(String name, String email, LocalDate localDate, Integer age) {
        this.name = name;
        this.email = email;
        this.localDate = localDate;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", localDate=" + localDate +
                ", age=" + age +
                '}';
    }
}
