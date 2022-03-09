package com.nuno.neto.schooljpa.dto.schoolClassDTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolClassDetailsDTO {

    private Long schoolClassId;
    private String schoolClassName;

}
