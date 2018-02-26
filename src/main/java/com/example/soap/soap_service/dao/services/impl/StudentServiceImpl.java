package com.example.soap.soap_service.dao.services.impl;

import com.example.soap.soap_service.dao.entity.StudentEntity;
import com.example.soap.soap_service.dao.repositories.StudentRepository;
import com.example.soap.soap_service.dao.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public void save(StudentEntity studentEntity) {
        repository.save(studentEntity);
    }

    @Override
    public StudentEntity get(String id) {
        return repository.findOne(id);
    }
}
