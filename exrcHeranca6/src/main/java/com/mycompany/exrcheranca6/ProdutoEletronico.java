
package com.mycompany.exrcheranca6;


public class ProdutoEletronico extends Produto {
    private int voltagem;

    public int getVoltagem() { return voltagem; }
    public void setVoltagem(int voltagem) { this.voltagem = voltagem; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Voltagem: " + voltagem);
    }
}
