package com.example.jacoco.controller;
import com.example.jacoco.data_service.SwitchOperacao;
import com.example.jacoco.dto.OperacaoDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class CalculaController {

    SwitchOperacao switchOperacao;

    @PostMapping("/teste")
    public String calcula(@RequestBody OperacaoDTO operacaoDTO){
        return switchOperacao.escolheOperacao(operacaoDTO.getOperacao());
    }

}
