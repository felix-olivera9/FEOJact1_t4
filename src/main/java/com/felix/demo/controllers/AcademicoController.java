package com.felix.demo.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademicoController {

    // Endpoint B: Información de un listado simulado (materias)
    @GetMapping("/materias")
    public List<String> listarMaterias() {
        return Arrays.asList(
            "Taller de Investigación I",
            "Arquitectura de Computadoras",
            "Simulación",
            "Administración de Bases de Datos"
        );
    }
}