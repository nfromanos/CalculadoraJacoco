package com.example.jacoco.data_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculaTest {

    Calcula calcula = new Calcula();

    @Test
    void somar() {
        var soma = calcula.somar(5D, 5D);
        Assertions.assertEquals(soma, 10D);
    }

    @Test
    void subtrair() {
        var subtrair = calcula.subtrair(10D, 5D);
        Assertions.assertEquals(subtrair, 5D);
    }

    @Test
    void divisao() {
        var divisao = calcula.divisao(10D, 2D);
        Assertions.assertEquals(divisao, 5D);
    }

    @Test
    void multiplicacao() {
        var multiplicacao = calcula.multiplicacao(2D, 2D);
        Assertions.assertEquals(multiplicacao, 4D);
    }

    @Test
    void divisaoPorZero(){
        var exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            var divisaoPorZero = calcula.divisao(10D, 0D);
        });
        String mensagemEsperada = "Não pode ser divisível por 0";
        Assertions.assertEquals(exception.getMessage(), mensagemEsperada);
    }

    @Test
    void multiplicacaoNegativo(){
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            var multiplicacaoNegativo = calcula.multiplicacao(-5D, 5D);
        });
        String mensagemEsperada = "Nenhum dos parâmetros podem ser menor que 0";
        Assertions.assertEquals(exception.getMessage(), mensagemEsperada);
    }
}