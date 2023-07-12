package com.dgmf.springbootmysqlsms.service.impl;

import com.dgmf.springbootmysqlsms.entity.Student;
import com.dgmf.springbootmysqlsms.repository.StudentRepository;
import com.dgmf.springbootmysqlsms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
