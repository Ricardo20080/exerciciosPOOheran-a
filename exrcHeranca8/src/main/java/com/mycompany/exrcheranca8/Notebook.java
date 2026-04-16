
package com.mycompany.exrcheranca8;


public class Notebook extends Dispositivo {
    private String processador;

    public String getProcessador() { return processador; }
    public void setProcessador(String processador) { this.processador = processador; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Processador: " + processador);
    }
}
