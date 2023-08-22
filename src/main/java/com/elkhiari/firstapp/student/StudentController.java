package com.elkhiari.firstapp.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student",name = "student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "othmane",
                        LocalDate.of(2003,11,28),
                        19,
                        "Othmaneelkhiari@gmail.com"
                )
        );
    }

}
