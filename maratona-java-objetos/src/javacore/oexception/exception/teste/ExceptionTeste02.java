package javacore.oexception.exception.teste;

import java.io.File;
import java.io.IOException;

import static javacore.oexception.exception.teste.ExceptionTeste01.criarNovoAquivo;

public class ExceptionTeste02 {
    public static void main(String[] args) throws IOException {
        criarNovoAquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
