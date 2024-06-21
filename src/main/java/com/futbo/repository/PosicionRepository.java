package com.futbo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.futbo.entity.Futbolista;
import com.futbo.entity.Posicion;

public interface PosicionRepository extends JpaRepository<Posicion, Integer>{
	@Query("SELECT p FROM Posicion p")
    List<Posicion> findAllPosicion();

}
