package com.usa.ciclo3.retociclo3.controller;

import com.usa.ciclo3.retociclo3.model.Ortopedic;
import com.usa.ciclo3.retociclo3.service.OrtopedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortopedic")
@CrossOrigin (origins= "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class OrtopedicController {
    @Autowired
    private OrtopedicService ortopedicService;

    @GetMapping("/all")
    public List<Ortopedic> getAll(){return ortopedicService.getAll();}

    @GetMapping("/{id}")
    public Optional<Ortopedic> getOrtopedic(@PathVariable("id") int id){return ortopedicService.getOrtopedic(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic save(@RequestBody Ortopedic ortopedic){ return ortopedicService.save(ortopedic);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortopedic update(@RequestBody Ortopedic ortopedic){return ortopedicService.update(ortopedic);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id") int id){return ortopedicService.deleteOrtopedic(id);}
}
