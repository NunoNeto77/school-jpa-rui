package com.nuno.neto.schooljpa.service.student;

import com.nuno.neto.schooljpa.converter.StudentConverter;
import com.nuno.neto.schooljpa.dto.studentDTO.CreateStudentDTO;
import com.nuno.neto.schooljpa.dto.studentDTO.StudentDetailsDTO;
import com.nuno.neto.schooljpa.persistence.entity.SchoolClassEntity;
import com.nuno.neto.schooljpa.persistence.entity.StudentEntity;
import com.nuno.neto.schooljpa.persistence.entity.SubjectEntity;
import com.nuno.neto.schooljpa.persistence.repository.SchoolClassRepository;
import com.nuno.neto.schooljpa.persistence.repository.StudentRepository;
import com.nuno.neto.schooljpa.persistence.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final SchoolClassRepository schoolClassRepository;


    @Override
    public StudentDetailsDTO createStudent(CreateStudentDTO createStudentDTO) {
        StudentEntity studentEntity = StudentConverter.fromCreateStudentDTO(createStudentDTO);
        List<SubjectEntity> subjectEntitiesList = createStudentDTO.getSubjects().stream()
                .map(subjectRepository::getById) // subjectId -> subjectRepository.getById(subjectId)
                .collect(Collectors.toList());

        studentEntity.setSubjects(subjectEntitiesList);

        SchoolClassEntity schoolClassEntity = schoolClassRepository.getById(createStudentDTO.getSchoolClassId());
        studentEntity.setSchoolClass(schoolClassEntity);
        StudentEntity createdStudent = studentRepository.save(studentEntity);
        return StudentConverter.toStudentDetailsDTO(createdStudent);
    }

    @Override
    public List<StudentDetailsDTO> getStudents() {
        return studentRepository.findAll()
                .stream()
                .map(StudentConverter::toStudentDetailsDTO)
                .collect(Collectors.toList());
    }




   /* @Override
    public StudentDetailsDTO getStudentById(Long studentId) {
        Optional<StudentEntity> student = studentRepository.findById(studentId);
        if (student.isEmpty()) {
            return null;
        }
        return StudentConverter.toStudentDetailsDTO(student.get());
    } */


  /*  @Override
    public void deleteStudent(Long studentId) {
        Assert.notNull(studentId, "Student ID does not exist.");
        studentRepository.deleteById(studentId);
    } */
}
