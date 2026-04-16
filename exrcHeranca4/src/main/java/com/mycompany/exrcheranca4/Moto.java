
package com.mycompany.exrcheranca4;


public class Moto extends Veiculo {
    private int cilindradas;

    public int getCilindradas() { return cilindradas; }
    public void setCilindradas(int cilindradas) { this.cilindradas = cilindradas; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }
}
