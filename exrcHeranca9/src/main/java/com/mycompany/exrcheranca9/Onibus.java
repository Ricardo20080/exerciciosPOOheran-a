
package com.mycompany.exrcheranca9;

public class Onibus extends Transporte {
    private String numeroLinha;

    public String getNumeroLinha() { return numeroLinha; }
    public void setNumeroLinha(String numeroLinha) { this.numeroLinha = numeroLinha; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linha: " + numeroLinha);
    }
}