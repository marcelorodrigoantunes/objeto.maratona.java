package javacore.funcionario.test;

import javacore.funcionario.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcelo");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();
    }
}
