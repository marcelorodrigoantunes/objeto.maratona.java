package javacore.oexception.runtime.teste;

public class RuntimeExceptionTeste02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        try {
         return a/b;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a/b;
    }
}
