package com.nuno.neto.schooljpa.converter;

import com.nuno.neto.schooljpa.dto.schoolClassDTO.CreateSchoolClassDTO;
import com.nuno.neto.schooljpa.dto.schoolClassDTO.SchoolClassDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.SchoolClassEntity;

public class SchoolClassConverter {

    public static SchoolClassEntity fromCreateSchoolClassDTO(CreateSchoolClassDTO createSchoolClassDTO) {
        return SchoolClassEntity.builder()
                .schoolClassName(createSchoolClassDTO.getSchoolClassName())
                .build();
    }

    public static SchoolClassDetailsDTO toSchoolClassDetailsDTO(SchoolClassEntity schoolClassEntity) {
        return SchoolClassDetailsDTO.builder()
                .schoolClassId(schoolClassEntity.getSchoolClassId())
                .schoolClassName(schoolClassEntity.getSchoolClassName())
                .build();
    }

}
