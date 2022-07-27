package me.dio.academia.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Spring.Data.JPA.demo.controller.AvaliacaoFisicaForm;
import Spring.service.impl.AvaliacaoFisicaServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public <AvaliacaoFisica> AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
    return (AvaliacaoFisica) service.create(form);
  }

  @GetMapping
  public List<Spring.Data.JPA.demo.controller.AvaliacaoFisica> getAll(){
    return service.getAll();
  }

}