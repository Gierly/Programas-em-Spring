package com.expertcode.ex0002.Service;

import org.springframework.stereotype.Service;

@Service
public class ConcatenaService {
    public String Concatenacao(Character value){

        String meuNome = "Gierly";
        return meuNome+value;
    }
}
