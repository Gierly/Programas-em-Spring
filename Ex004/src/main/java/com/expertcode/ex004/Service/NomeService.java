package com.expertcode.ex004.Service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Getter
@Setter
@Service
public class NomeService {

    private List<String> listaNomes = new ArrayList<>();

    @Transactional
    public void addNome(String value){
        if (listaNomes.stream().noneMatch(it -> it.equals(value))) {
            listaNomes.add(value);
        }
    }

    @Transactional
    public void delete (String nome){
        listaNomes.remove(nome);
        listaNomes.addAll(listaNomes.stream().filter(it -> !it.equals(nome)).collect(Collectors.toSet()));
    }

}
