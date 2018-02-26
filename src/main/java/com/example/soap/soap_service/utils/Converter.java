package com.example.soap.soap_service.utils;

import com.example.soap.soap_service.dao.entity.StudentEntity;
import com.example.soap.soap_service.models.Student;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    public static Student convert(StudentEntity entity) {
        Student student = new Student();
        student.setId(entity.getId());
        student.setFirstname(entity.getFirstname());
        student.setMidname(entity.getMidname());
        student.setLastname(entity.getLastname());
        student.setLevel(entity.getLevel());
        student.setEmail(entity.getEmail());
        return student;
    }
}
