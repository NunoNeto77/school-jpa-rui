package com.nuno.neto.schooljpa.persistence.repository;

import com.nuno.neto.schooljpa.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
