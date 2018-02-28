package com.example.soap.soap_service.dao.services;

import com.example.soap.soap_service.dao.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    void save(StudentEntity studentEntity);

    StudentEntity get(String id);

    List<StudentEntity> getAll();
}
