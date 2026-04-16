

package com.mycompany.exrcheranca8;


public class ExrcHeranca8 {

    public static void main(String[] args) {
        Celular c = new Celular();
        c.setMarca("Samsung");
        c.setModelo("S21");
        c.setMemoria(128);

        Notebook n = new Notebook();
        n.setMarca("Dell");
        n.setModelo("Inspiron");
        n.setProcessador("i7");

        c.exibirDados();
        System.out.println();
        n.exibirDados();
    }
}
