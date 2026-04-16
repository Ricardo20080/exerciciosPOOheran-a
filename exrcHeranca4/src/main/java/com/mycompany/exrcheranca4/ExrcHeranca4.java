
package com.mycompany.exrcheranca4;


public class ExrcHeranca4 {

    public static void main(String[] args) {
         Carro c = new Carro();
        c.setMarca("Toyota");
        c.setModelo("Corolla");
        c.setAno(2020);
        c.setNumeroPortas(4);

        Moto m = new Moto();
        m.setMarca("Honda");
        m.setModelo("CB500");
        m.setAno(2022);
        m.setCilindradas(500);

        c.exibirDados();
        m.exibirDados();
    }
}
