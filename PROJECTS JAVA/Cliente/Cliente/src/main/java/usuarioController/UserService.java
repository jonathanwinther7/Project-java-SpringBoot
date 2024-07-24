package usuarioController;

import usuario.User;

import java.math.BigDecimal;


public class UserService {

    public Boolean validation(User user, BigDecimal valorAEnviar) {
        Boolean isValid = false;
        int retornoDoCompareTo = user.getBalance().compareTo(valorAEnviar);
        switch (retornoDoCompareTo) {
            case 1:
                //Quando o valor a enviar for maior que o valor que está na carteira
                isValid = false;
            break;
            case 0:
                // Quando o valor a enviar for igual ao valor a carteira
                isValid = true;
            break;
            case -1:
                //Quando o valor a enviar for menor que o valor na carteira
                isValid = true;
            break;
        }
        return isValid;
    }



}