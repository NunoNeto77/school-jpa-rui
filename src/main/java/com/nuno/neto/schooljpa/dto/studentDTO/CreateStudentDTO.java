package com.nuno.neto.schooljpa.dto.studentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateStudentDTO {

    private String firstName;
    private String lastName;
    private List<Long> subjects;
    private Long schoolClassId;
}
