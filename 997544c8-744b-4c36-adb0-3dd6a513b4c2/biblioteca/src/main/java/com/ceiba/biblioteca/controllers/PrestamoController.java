package com.ceiba.biblioteca.controllers;

import com.ceiba.biblioteca.models.PrestamoModel;
import com.ceiba.biblioteca.services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prestamo")
@Validated
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @PostMapping()
    public PrestamoModel crearPrestamoLibro(@RequestBody PrestamoModel prestamo){
        return this.prestamoService.crearPrestamoLibro(prestamo);
    }

    @GetMapping(path = "/{id}")
    public Optional<PrestamoModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
        return prestamoService.obtenerPrestamoPorId(id);
    }

}
