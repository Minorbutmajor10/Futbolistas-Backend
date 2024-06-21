package com.futbo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.futbo.entity.Futbolista;
import com.futbo.service.FutbolistaService;

@RestController
@RequestMapping("/futbolistas")
public class FutbolistaController {
	 @Autowired
	    private FutbolistaService futbolistaService;

	 
	 @GetMapping("/")
	    public ResponseEntity<List<Futbolista>> getAllFutbolistas() {
	        List<Futbolista> futbolistas = futbolistaService.findAllFutbolistas();
	        return ResponseEntity.ok(futbolistas);
	    }
	 
	    @GetMapping("/{id}")
	    public ResponseEntity<List<Futbolista>> getFutbolistaById(@PathVariable int id) {
	        List<Futbolista> futbolistas = futbolistaService.findById(id);
	        if (!futbolistas.isEmpty()) {
	            return ResponseEntity.ok(futbolistas);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

}
