package com.nuno.neto.schooljpa.service.student;

import com.nuno.neto.schooljpa.dto.studentDTO.CreateStudentDTO;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;

import java.util.List;

public interface StudentService {

    public StudentDetailsDTO createStudent(CreateStudentDTO createStudentDTO);
    public List<StudentDetailsDTO> getStudents();

}
