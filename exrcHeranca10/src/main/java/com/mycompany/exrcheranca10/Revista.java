
package com.mycompany.exrcheranca10;


public class Revista extends ItemBiblioteca {
    private int edicao;

    public int getEdicao() { return edicao; }
    public void setEdicao(int edicao) { this.edicao = edicao; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Edição: " + edicao);
    }
}