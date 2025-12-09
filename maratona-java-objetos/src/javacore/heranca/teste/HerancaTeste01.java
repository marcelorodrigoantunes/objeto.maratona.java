package javacore.heranca.teste;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3 ");
        endereco.setCep("12312-234");
        Pessoa pessoa = new Pessoa("Marcelo");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("João");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        System.out.println("------------");
        funcionario.setSalario(2000);

        funcionario.imprime();
    }
}
