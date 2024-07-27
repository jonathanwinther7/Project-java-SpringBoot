package com.autenticacao.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.autenticacao.dto.User;

@Service
public class UserService {

    public Boolean validation(User user, BigDecimal valorAEnviar) {
        Boolean isValid = false;
        int retornoDoCompareTo = user.getBalance().compareTo(valorAEnviar);
        switch (retornoDoCompareTo) {
            case 1:
                //Quando o valor na carteira for maior que o valor que à enviar
                isValid = true;
            break;
            case 0:
                // Quando o valor a enviar for igual ao valor a carteira
                isValid = true;
            break;
            case -1:
                //Quando o valor na carteira for menor que o valor que à enviar
                isValid = false;
            break;
        }
        return isValid;
    }



}