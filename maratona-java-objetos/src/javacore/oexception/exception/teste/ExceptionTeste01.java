package javacore.oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
    criarNovoAquivo();
    }
    private static void criarNovoAquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
