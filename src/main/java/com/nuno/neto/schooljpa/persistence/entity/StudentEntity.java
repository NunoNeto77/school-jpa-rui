package com.nuno.neto.schooljpa.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_class_id")
    private SchoolClassEntity schoolClass;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "students_and_subjects",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<SubjectEntity> subjects;

}


