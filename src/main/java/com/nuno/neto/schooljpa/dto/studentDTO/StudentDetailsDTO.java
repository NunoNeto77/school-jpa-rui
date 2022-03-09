package com.nuno.neto.schooljpa.dto.studentDTO;

import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class StudentDetailsDTO {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String schoolClassName;
    private List<String> subjects;
}
