package javacore.npolimorfismo.teste;

import javacore.npolimorfismo.dominio.Computador;
import javacore.npolimorfismo.dominio.Produto;
import javacore.npolimorfismo.dominio.Tomate;
import javacore.npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
