package javacore.oexception.exception.teste;

import javacore.oexception.exception.dominio.Funcionario;
import javacore.oexception.exception.dominio.LoginInvalidoException;
import javacore.oexception.exception.dominio.Pessoa;

public class SobreescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
