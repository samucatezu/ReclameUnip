package com.rest.reclameunip.Repository;

import com.rest.reclameunip.Model.university;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface universityRepository extends JpaRepository<university, Long> {

}
