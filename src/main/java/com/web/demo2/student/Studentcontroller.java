package com.web.demo2.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping(path="api/v1/student")
public class Studentcontroller
{
    @GetMapping
    public Student student()
    {
        return (
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
