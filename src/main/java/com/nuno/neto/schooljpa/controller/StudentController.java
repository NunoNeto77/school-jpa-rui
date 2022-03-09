package com.nuno.neto.schooljpa.controller;

import com.nuno.neto.schooljpa.dto.studentDTO.CreateStudentDTO;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;
import com.nuno.neto.schooljpa.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @PostMapping()
    public ResponseEntity<StudentDetailsDTO> createStudent(@RequestBody CreateStudentDTO createStudentDTO) {
        return ResponseEntity.ok(studentService.createStudent(createStudentDTO));
    }

    @GetMapping()
    public ResponseEntity<List<StudentDetailsDTO>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }


}
