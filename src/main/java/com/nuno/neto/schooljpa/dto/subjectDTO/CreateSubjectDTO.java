package com.nuno.neto.schooljpa.dto.subjectDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateSubjectDTO {
    private String subjectName;
}
