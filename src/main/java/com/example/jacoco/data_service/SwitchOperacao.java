package com.example.jacoco.data_service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class SwitchOperacao {
    // 2 + 2
    // 2 * 2
    // 200 - 2
    // 2 / 2

    Calcula calcula;
    public String escolheOperacao(String operacao){
        var listaOperacao = operacao.split(" ");
        List<String> operacoesPermitidas = List.of("+", "-", "/", "*");
        if(!operacoesPermitidas.contains(listaOperacao[1])){
            throw new IllegalArgumentException("Operação inválida\nEx: +, -, *, /");
        }
        Double resultado;
        switch(listaOperacao[1]){
            case "+":
                resultado = calcula.somar(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
                break;
            case "-":
                resultado = calcula.subtrair(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
                break;
            case "/":
                resultado = calcula.divisao(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
                break;
            case "*":
                resultado = calcula.multiplicacao(Double.valueOf(listaOperacao[0]), Double.valueOf(listaOperacao[2]));
                break;
            default:
                throw new IllegalArgumentException("Operação inválida\nEx: +, -, *, /");
        }

        return resultado.toString();
    }

}
