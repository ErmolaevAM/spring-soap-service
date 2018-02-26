package com.example.soap.soap_service.dao.repositories;

import com.example.soap.soap_service.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
}
