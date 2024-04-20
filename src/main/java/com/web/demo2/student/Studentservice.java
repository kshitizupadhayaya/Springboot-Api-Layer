package com.web.demo2.student;



import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Component
public class Studentservice
{

    public List<Student> getStudents()
    {
        return  List.of(
                new Student(
                        1,
                        "Kshitiz",
                        "kxupadhayaya@gmail.com",
                        LocalDate.of(2004, Month.JANUARY,5),
                        21
                )
        );
    }
}
