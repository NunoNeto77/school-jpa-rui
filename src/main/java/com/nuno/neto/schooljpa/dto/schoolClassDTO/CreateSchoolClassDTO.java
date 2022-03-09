package com.nuno.neto.schooljpa.dto.schoolClassDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateSchoolClassDTO {

    private String schoolClassName;

}
