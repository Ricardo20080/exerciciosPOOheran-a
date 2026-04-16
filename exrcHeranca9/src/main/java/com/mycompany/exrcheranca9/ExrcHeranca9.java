
package com.mycompany.exrcheranca9;

public class ExrcHeranca9 {

    public static void main(String[] args) {
              Aviao a = new Aviao();
        a.setCapacidade(180);
        a.setVelocidade(850);
        a.setCompanhiaAerea("LATAM");

        Onibus o = new Onibus();
        o.setCapacidade(50);
        o.setVelocidade(80);
        o.setNumeroLinha("101");

        a.exibirDados();
        System.out.println();
        o.exibirDados();
    }
}
