package com.nuno.neto.schooljpa.service.subject;

import com.nuno.neto.schooljpa.converter.SubjectConverter;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.CreateSubjectDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.SubjectDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.SubjectEntity;
import com.nuno.neto.schooljpa.persistence.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    @Override
    public SubjectDetailsDTO createSubject(CreateSubjectDTO createSubjectDTO) {
        SubjectEntity subjectEntity = SubjectConverter.fromCreateSubjectDTO(createSubjectDTO);
        SubjectEntity createdSubject = subjectRepository.save(subjectEntity);
        return SubjectConverter.toSubjectDetailsDTO(createdSubject);
    }

    @Override
    public List<SubjectDetailsDTO> getSubjects() {
        return subjectRepository.findAll()
                .stream()
                .map(SubjectConverter::toSubjectDetailsDTO)
                .collect(Collectors.toList());
    }

   /* @Override
    public void deleteSubject(Long subjectId) {
        Assert.notNull(subjectId, "Subject ID does not exist.");
        subjectRepository.deleteById(subjectId);
    } */
}
