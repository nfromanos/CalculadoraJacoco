package com.example.jacoco.data_service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SwitchOperacaoTest {

    private static SwitchOperacao switchOperacao;
    @BeforeAll
    static void beforeAll() {
        Calcula calcula = new Calcula();
        switchOperacao = new SwitchOperacao(calcula);
    }

    @Test
    public void verificaOperacaoTest(){
        var operacao = "2+2";
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            var multiplicacaoNegativo = switchOperacao.escolheOperacao(operacao);
        });
        String mensagemEsperada = "Tamanho pequeno";
        Assertions.assertEquals(exception.getMessage(), mensagemEsperada);
    }
    @Test
    public void verificaOperacaoInvalidaTest(){
        var operacao = "2 = 2";
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            var multiplicacaoNegativo = switchOperacao.escolheOperacao(operacao);
        });
        String mensagemEsperada = "Operação inválida\nEx: +, -, *, /";
        Assertions.assertEquals(exception.getMessage(), mensagemEsperada);
    }

}