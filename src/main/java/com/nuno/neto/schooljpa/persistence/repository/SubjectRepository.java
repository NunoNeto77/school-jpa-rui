package com.nuno.neto.schooljpa.persistence.repository;

import com.nuno.neto.schooljpa.persistence.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
}
