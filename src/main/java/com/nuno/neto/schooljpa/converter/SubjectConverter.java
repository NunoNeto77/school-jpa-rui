package com.nuno.neto.schooljpa.converter;

import com.nuno.neto.schooljpa.dto.studentDTO.CreateStudentDTO;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.CreateSubjectDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.SubjectDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.StudentEntity;
import com.nuno.neto.schooljpa.persistence.entity.SubjectEntity;

public class SubjectConverter {

    public static SubjectEntity fromCreateSubjectDTO(CreateSubjectDTO createSubjectDTO) {
        return SubjectEntity.builder()
                .subjectName(createSubjectDTO.getSubjectName())
                .build();
    }

    public static SubjectDetailsDTO toSubjectDetailsDTO(SubjectEntity subjectEntity) {
        return SubjectDetailsDTO.builder()
                .subjectId(subjectEntity.getSubjectId())
                .subjectName(subjectEntity.getSubjectName())
                .build();
    }
}
