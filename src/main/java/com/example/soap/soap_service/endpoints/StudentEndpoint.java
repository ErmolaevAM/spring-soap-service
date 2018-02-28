package com.example.soap.soap_service.endpoints;

import com.example.soap.soap_service.dao.services.StudentService;
import com.example.soap.soap_service.models.*;
import com.example.soap.soap_service.utils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Endpoint
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://soap.example.com/soap_service/models";

    @Autowired
    private StudentService studentService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentsRequest")
    @ResponsePayload
    public GetStudentsResponse getStudent(@RequestPayload GetStudentsRequest request) {
        GetStudentsResponse response = new GetStudentsResponse();
        Student student = Converter.studentEntityToStudent(studentService.get(request.getId()));
        response.setStudent(student);

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllStudentsRequest")
    @ResponsePayload
    public GetAllStudentsResponse getAllStudents(@RequestPayload GetAllStudentsRequest request) {
        GetAllStudentsResponse response = new GetAllStudentsResponse();
        List<Student> students = new ArrayList<>();
        studentService.getAll().forEach(studentEntity -> {
            students.add(Converter.studentEntityToStudent(studentEntity));
        });

        /*very bad solution, as i think*/
        Class<?> responseClass = response.getClass();
        try {
            Field field = responseClass.getDeclaredField("students");
            field.setAccessible(true);
            field.set(response, students);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "setStudentsRequest")
    @ResponsePayload
    public SetStudentsResponse setStudent(@RequestPayload SetStudentsRequest request) {
        SetStudentsResponse response = new SetStudentsResponse();
        studentService.save(Converter.studentToStudentEntity(request.getStudent()));
        response.setCode(200);

        return response;
    }




}
