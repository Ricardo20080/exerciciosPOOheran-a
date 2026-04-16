
package com.mycompany.exrcheranca6;


public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public String getDataValidade() { return dataValidade; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Validade: " + dataValidade);
    }
}
