package com.autenticacao.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.autenticacao.dto.ReturnValidation;
import com.autenticacao.dto.User;

@Service
public class UserService {

    public ReturnValidation validation(User user, BigDecimal valorAEnviar) {
    	
        ReturnValidation returnValidation = null;
        
        int retornoDoCompareTo = user.getBalance().compareTo(valorAEnviar);
        switch (retornoDoCompareTo) {
            case 1:
                //Quando o valor na carteira for maior que o valor que à enviar
            	returnValidation = new ReturnValidation(true, "Autorizado");
                
           // break;
            case 0:
                // Quando o valor a enviar for igual ao valor a carteira
               
            	returnValidation =   new ReturnValidation(true, "Autorizado");
            break;
            case -1:
                //Quando o valor na carteira for menor que o valor que à enviar
               
            	returnValidation = new ReturnValidation(false, "Não autorizado");
            break;
        }
       return returnValidation;
       
    }



}