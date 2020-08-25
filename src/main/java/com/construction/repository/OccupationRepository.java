package com.construction.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.construction.models.Occupation;



@Repository
public interface OccupationRepository extends JpaRepository<Occupation, Integer> 
{
	

}