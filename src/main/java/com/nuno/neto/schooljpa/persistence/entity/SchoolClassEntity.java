package com.nuno.neto.schooljpa.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

// turma

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "classes")
public class SchoolClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolClassId;

    @Column(nullable = false, unique = true)
    private String schoolClassName;

    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.ALL)
    private List<StudentEntity> student;
}
