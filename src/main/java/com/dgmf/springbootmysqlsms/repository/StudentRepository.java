package com.dgmf.springbootmysqlsms.repository;

import com.dgmf.springbootmysqlsms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
