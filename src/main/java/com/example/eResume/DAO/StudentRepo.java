package com.example.eResume.DAO;

import com.example.eResume.DTO.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
   Student findByName(String name);
   Student findByEmail(String mail);
}
