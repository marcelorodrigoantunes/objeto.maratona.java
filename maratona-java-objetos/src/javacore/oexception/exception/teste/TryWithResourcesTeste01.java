package javacore.oexception.exception.teste;

import javacore.oexception.exception.dominio.Leitor1;
import javacore.oexception.exception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        }catch (IOException e){

        }
    }
}
