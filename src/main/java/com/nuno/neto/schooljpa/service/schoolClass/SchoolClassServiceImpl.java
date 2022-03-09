package com.nuno.neto.schooljpa.service.schoolClass;

import com.nuno.neto.schooljpa.converter.SchoolClassConverter;
import com.nuno.neto.schooljpa.dto.schoolClassDTO.CreateSchoolClassDTO;
import com.nuno.neto.schooljpa.dto.schoolClassDTO.SchoolClassDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.SchoolClassEntity;
import com.nuno.neto.schooljpa.persistence.repository.SchoolClassRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SchoolClassServiceImpl implements SchoolClassService {

    private final SchoolClassRepository schoolClassRepository;

    @Override
    public SchoolClassDetailsDTO createSchoolClass(CreateSchoolClassDTO createSchoolClassDTO) {
        SchoolClassEntity schoolClassEntity = SchoolClassConverter.fromCreateSchoolClassDTO(createSchoolClassDTO);
        SchoolClassEntity createdSchoolClass = schoolClassRepository.save(schoolClassEntity);
        return SchoolClassConverter.toSchoolClassDetailsDTO(createdSchoolClass);
    }

    @Override
    public List<SchoolClassDetailsDTO> getSchoolClasses() {
        return schoolClassRepository.findAll()
                .stream()
                .map(SchoolClassConverter::toSchoolClassDetailsDTO)
                .collect(Collectors.toList());
    }

   /* @Override
    public void deleteSchoolClass(Long schoolClassId) {
        Assert.notNull(schoolClassId, "School class ID does not exist.");
        schoolClassRepository.deleteById(schoolClassId);
    } */
}
