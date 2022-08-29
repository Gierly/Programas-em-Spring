package com.expertcode.ex001.Controller;

import com.expertcode.ex001.Service.CalculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/calcula")
public class CalculaController {


    private final CalculaService calculaService;

    @GetMapping
    public String getValue(@RequestParam String value){

        Integer numeroAtualizado;
        numeroAtualizado=calculaService.somar(Integer.valueOf(value));
        return "o Valor atualizado e: "+numeroAtualizado;
    }

}
