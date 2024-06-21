package com.futbo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.futbo.entity.Futbolista;



public interface FutbolistaRepository extends JpaRepository<Futbolista, Integer> {

	@Query("SELECT f FROM Futbolista f WHERE f.id = ?1")
	public abstract List<Futbolista> findById(int id);

	@Query("SELECT f FROM Futbolista f")
    List<Futbolista> findAllFutbolistas();
}
