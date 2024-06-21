package com.futbo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futbo.entity.Futbolista;
import com.futbo.repository.FutbolistaRepository;

@Service
public class FutbolistaService{
	@Autowired
    private FutbolistaRepository futbolistaRepository;

    public List<Futbolista> findById(int id) {
        return futbolistaRepository.findById(id);
    }
    
    public List<Futbolista> findAllFutbolistas() {
        return futbolistaRepository.findAllFutbolistas();
    }
    
  
    

}
