package com.assessment.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assessment.test.entity.Warranty;

@Repository
public interface WarrantyRepo extends JpaRepository<Warranty, Long> {
}
