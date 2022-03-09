package com.nuno.neto.schooljpa.service.schoolClass;

import com.nuno.neto.schooljpa.dto.schoolClassDTO.CreateSchoolClassDTO;
import com.nuno.neto.schooljpa.dto.schoolClassDTO.SchoolClassDetailsDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.CreateSubjectDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.SubjectDetailsDTO;

import java.util.List;

public interface SchoolClassService {

    public SchoolClassDetailsDTO createSchoolClass(CreateSchoolClassDTO createSchoolClassDTO);
    public List<SchoolClassDetailsDTO> getSchoolClasses();
 }
