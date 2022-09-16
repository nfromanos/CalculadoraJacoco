package com.example.jacoco.data_service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class SwitchOperacao {

    Calcula calcula;
    public String escolheOperacao(String operacao){
        var listaOperacao = operacao.split(" ");
        List<String> operacoesPermitidas = List.of("+", "-", "/", "*");
        verificarOperacao(listaOperacao, operacoesPermitidas);
        return getResultado(listaOperacao).toString();
    }

    private Double getResultado(String[] listaOperacao) {
        switch(listaOperacao[1]){
            case "+":
                return calcula.somar(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
            case "-":
                return calcula.subtrair(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
            case "/":
                return calcula.divisao(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
            case "*":
                return calcula.multiplicacao(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
            default:
                throw new IllegalArgumentException("Operação inválida\nEx: +, -, *, /");
        }
    }

    private void verificarOperacao(String[] listaOperacao, List<String> operacoesPermitidas) {
        if(!operacoesPermitidas.contains(listaOperacao[1])){
            throw new IllegalArgumentException("Operação inválida\nEx: +, -, *, /");
        }
    }

}
