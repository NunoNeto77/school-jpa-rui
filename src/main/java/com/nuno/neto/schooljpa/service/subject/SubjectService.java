package com.nuno.neto.schooljpa.service.subject;

import com.nuno.neto.schooljpa.dto.subjectDTO.CreateSubjectDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.SubjectDetailsDTO;

import java.util.List;

public interface SubjectService {

    public SubjectDetailsDTO createSubject(CreateSubjectDTO createSubjectDTO);
    public List<SubjectDetailsDTO> getSubjects();

}
