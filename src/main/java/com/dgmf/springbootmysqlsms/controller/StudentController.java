package com.dgmf.springbootmysqlsms.controller;

import com.dgmf.springbootmysqlsms.entity.Student;
import com.dgmf.springbootmysqlsms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}
