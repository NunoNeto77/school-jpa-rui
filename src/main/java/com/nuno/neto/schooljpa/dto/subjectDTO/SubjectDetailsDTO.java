package com.nuno.neto.schooljpa.dto.subjectDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubjectDetailsDTO {

    private Long subjectId;
    private String subjectName;
}
