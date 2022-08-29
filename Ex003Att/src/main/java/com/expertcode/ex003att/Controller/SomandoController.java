package com.expertcode.ex003att.Controller;

import com.expertcode.ex003att.Service.SomandoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/somando")
public class SomandoController {


    public final SomandoService somandoService;

    @RequestMapping
    public String Sum(@RequestParam String value){
        somandoService.setValor(Long.parseLong(value)+somandoService.getValor());
        return "Valor Atualizado: "+somandoService.getValor();


    }
}
