package com.nuno.neto.schooljpa.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

// disciplina

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "subjects")
public class SubjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(nullable = false, unique = true)
    private String subjectName;


    @ManyToMany(mappedBy = "subjects", cascade = CascadeType.ALL)
    private List<StudentEntity> students;
}
