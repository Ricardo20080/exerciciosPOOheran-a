
package com.mycompany.exrcheranca9;

public class Transporte {
    private int capacidade;
    private double velocidade;

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public double getVelocidade() { return velocidade; }
    public void setVelocidade(double velocidade) { this.velocidade = velocidade; }

    public void exibirDados() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Velocidade: " + velocidade);
    }
}
