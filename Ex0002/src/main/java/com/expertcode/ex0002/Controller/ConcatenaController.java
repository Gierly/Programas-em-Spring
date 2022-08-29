package com.expertcode.ex0002.Controller;

import com.expertcode.ex0002.Service.ConcatenaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("/Concatenação")
public class ConcatenaController {


    private final ConcatenaService concatenaService;

    @RequestMapping
    public String getValue(Character value){
        return concatenaService.Concatenacao(Character.valueOf(value));
    }
}
