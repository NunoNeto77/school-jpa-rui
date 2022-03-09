package com.nuno.neto.schooljpa.controller;

import com.nuno.neto.schooljpa.dto.schoolClassDTO.CreateSchoolClassDTO;
import com.nuno.neto.schooljpa.dto.schoolClassDTO.SchoolClassDetailsDTO;
import com.nuno.neto.schooljpa.service.schoolClass.SchoolClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/school-class")
public class SchoolClassController {

    private final SchoolClassService schoolClassService;

    @PostMapping()
    public ResponseEntity<SchoolClassDetailsDTO> createSchoolClass(@RequestBody CreateSchoolClassDTO createSchoolClassDTO) {
        return ResponseEntity.ok(schoolClassService.createSchoolClass(createSchoolClassDTO));
    }

    @GetMapping()
    public ResponseEntity<List<SchoolClassDetailsDTO>> getSchoolClasses() {
        return ResponseEntity.ok(schoolClassService.getSchoolClasses());
    }

}
