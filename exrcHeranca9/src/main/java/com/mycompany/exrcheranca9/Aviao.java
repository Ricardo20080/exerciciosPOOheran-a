
package com.mycompany.exrcheranca9;


public class Aviao extends Transporte {
    private String companhiaAerea;

    public String getCompanhiaAerea() { return companhiaAerea; }
    public void setCompanhiaAerea(String companhiaAerea) { this.companhiaAerea = companhiaAerea; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Companhia: " + companhiaAerea);
    }
}