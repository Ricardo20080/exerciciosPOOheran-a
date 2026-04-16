
package com.mycompany.exrcheranca8;

public class Celular extends Dispositivo {
    private int memoria;

    public int getMemoria() { return memoria; }
    public void setMemoria(int memoria) { this.memoria = memoria; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Memória: " + memoria + "GB");
    }
}
