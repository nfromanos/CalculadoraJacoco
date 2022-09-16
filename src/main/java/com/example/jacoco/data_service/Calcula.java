package com.example.jacoco.data_service;
import org.springframework.stereotype.Component;
@Component
public class Calcula {

    public Double somar(Double x, Double y){
        return x+y;
    }

    public Double subtrair(Double x, Double y){
        return x-y;
    }

    public Double divisao(Double x, Double y){
        if(y == 0){
            throw new ArithmeticException("Não pode ser divisível por 0");
        }
        return x/y;
    }

    public Double multiplicacao(Double x, Double y){
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Nenhum dos parâmetros podem ser menor que 0");
        }
        return x*y;
    }

}
