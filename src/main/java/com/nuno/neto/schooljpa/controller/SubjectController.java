package com.nuno.neto.schooljpa.controller;

import com.nuno.neto.schooljpa.dto.subjectDTO.CreateSubjectDTO;
import com.nuno.neto.schooljpa.dto.subjectDTO.SubjectDetailsDTO;
import com.nuno.neto.schooljpa.service.student.StudentService;
import com.nuno.neto.schooljpa.service.subject.SubjectService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    @PostMapping()
    public ResponseEntity<SubjectDetailsDTO> createSubject(@RequestBody CreateSubjectDTO createSubjectDTO) {
        return ResponseEntity.ok(subjectService.createSubject(createSubjectDTO));
    }

    @GetMapping()
    public ResponseEntity<List<SubjectDetailsDTO>> getSubjects() {
        return ResponseEntity.ok(subjectService.getSubjects());
    }
}
