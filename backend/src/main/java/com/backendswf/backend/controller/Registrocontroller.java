package com.backendswf.backend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backendswf.backend.models.registro;
import com.backendswf.backend.repositories.RegistroRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;






@RestController
@RequestMapping("/api/Registros")

public class Registrocontroller {

    @Autowired
    private RegistroRepository registroRepository;

    @GetMapping
    public List <registro> obtenertodoslosregistros() {
        return registroRepository.findAll();
    }

    @GetMapping ("/{idregistro}")
    public registro obtenerlosregistrosporidregistro(@PathVariable Long idregistro) {
        return registroRepository.findById(idregistro).orElse(null);
    
}
@PostMapping("/{idregistro}")
public registro crearregistro(@RequestBody registro registro) {
            return registroRepository.save(registro);
}
@PutMapping("/{idregistro}")
public registro actualizarregistro(@PathVariable long idregistro, @RequestBody registro registro) {
    registro.setIdregistro(idregistro);    
    return registroRepository.save(registro);
}
@DeleteMapping("/{idregistro}")
public void eliminarregistro(@PathVariable long idregistro) {
    registroRepository.deleteById(idregistro);
}
}
