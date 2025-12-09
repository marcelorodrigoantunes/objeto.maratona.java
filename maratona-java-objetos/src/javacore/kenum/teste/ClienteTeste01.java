package javacore.kenum.teste;

import javacore.kenum.dominio.Cliente;
import javacore.kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcelo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Joao",TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Jose",TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Pedro",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
