package com.felix.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    // Endpoint A: Identifica el proyecto y tu nombre
    @GetMapping("/proyecto")
    public String obtenerProyecto() {
        return "Proyecto Spring Boot - Félix Eliel Olivera Jiménez (Ingeniería en Sistemas Computacionales - ITO)";
    }

    // Endpoint C: Otro tipo de respuesta (estado del servidor)
    @GetMapping("/estado")
    public String obtenerEstado() {
        return "Servidor corriendo de forma exitosa al 100%";
    }
}