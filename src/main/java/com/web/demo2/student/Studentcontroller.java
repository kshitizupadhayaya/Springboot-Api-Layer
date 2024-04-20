package com.web.demo2.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="api/v1/student")
public class Studentcontroller
{
private final  Studentservice studentservice;

@Autowired
    public Studentcontroller(Studentservice studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> getStudents()
{
    return studentservice.getStudents();
}


}
