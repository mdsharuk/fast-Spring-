package com.example.springBoot.SpringBoot.Model;



import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
@Service
public class StudentService {

    public String Hello() {
        return
                String.valueOf(new Student(
                        6L,
                        "sharuk",
                        "sharuk@gmail.com",
                        LocalDate.of(2022, Month.AUGUST, 23),
                        22


                ));
    }
}
