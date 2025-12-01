package javacore.fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidademaxima;

    public double getVelocidadelimite() {
        return velocidadelimite;
    }

    public void setVelocidadelimite(double velocidadelimite) {
        this.velocidadelimite = velocidadelimite;
    }

    public double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double velocidadelimite = 250;
}
