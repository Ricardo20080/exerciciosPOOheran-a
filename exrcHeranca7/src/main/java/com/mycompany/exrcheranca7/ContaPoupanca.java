
package com.mycompany.exrcheranca7;


public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Rendimento: " + taxaRendimento);
    }
}
