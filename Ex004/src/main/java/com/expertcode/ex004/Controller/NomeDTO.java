package com.expertcode.ex004.Controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
public class NomeDTO implements Serializable {

    @NotBlank
    private String valor;
}
