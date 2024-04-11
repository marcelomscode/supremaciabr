package com.mscode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mscode.entity.Membros;

public interface MembrosRepository extends JpaRepository<Membros, Integer> {
	
	@Query("SELECT m FROM Membros m")
    public Membros findUniqueRecord();
}
