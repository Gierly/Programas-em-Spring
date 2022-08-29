package com.expertcode.ex004.Controller;

import com.expertcode.ex004.Service.NomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/nome")
public class NomeController {
    private final NomeService nomeService;

    @PostMapping("/adicionar")
    public String addNomes(@RequestBody @Valid NomeDTO nome) {
        nomeService.addNome(nome.getValor());
        return String.join(String.format("Valor %s inserido com sucesso. Lista de nomes: ", nome), nomeService.getListaNomes());
    }

    @DeleteMapping("/deletar")
    public void deleteNomes(@RequestParam String valor) {
            nomeService.delete(valor);
    }


}
