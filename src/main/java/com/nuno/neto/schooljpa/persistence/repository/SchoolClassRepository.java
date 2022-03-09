package com.nuno.neto.schooljpa.persistence.repository;

import com.nuno.neto.schooljpa.persistence.entity.SchoolClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolClassRepository extends JpaRepository<SchoolClassEntity, Long> {

}
