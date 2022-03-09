package com.nuno.neto.schooljpa.converter;

import com.nuno.neto.schooljpa.dto.studentDTO.CreateStudentDTO;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.StudentEntity;
import com.nuno.neto.schooljpa.persistence.entity.SubjectEntity;

import java.util.stream.Collectors;

public class StudentConverter {

    public static StudentEntity fromCreateStudentDTO(CreateStudentDTO createStudentDTO) {
        return StudentEntity.builder()
                .firstName(createStudentDTO.getFirstName())
                .lastName(createStudentDTO.getLastName())
                .build();
    }

    public static StudentDetailsDTO toStudentDetailsDTO(StudentEntity studentEntity) {
        return StudentDetailsDTO.builder()
                .studentId(studentEntity.getStudentId())
                .firstName(studentEntity.getFirstName())
                .lastName(studentEntity.getLastName())
                .schoolClassName(studentEntity.getSchoolClass().getSchoolClassName())
                .subjects(studentEntity.getSubjects().stream()
                        .map(subject -> subject.getSubjectName())
                        .collect(Collectors.toList()))
                .build();
    }
}
