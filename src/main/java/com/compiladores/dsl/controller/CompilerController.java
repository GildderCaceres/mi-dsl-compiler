package com.compiladores.dsl.controller;

import com.compiladores.dsl.service.CompilerService;
import com.compiladores.dsl.service.ResultadoCompilacion;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compiler")
@CrossOrigin("*")
public class CompilerController {

    @PostMapping("/compile")
    public ResultadoCompilacion compilar(
            @RequestBody String codigo
    ) {

        return CompilerService
                .compilarDesdeTexto(codigo);

    }

}