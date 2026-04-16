
package com.mycompany.exrcheranca3;


public class ExrcHeranca3 {

    public static void main(String[] args) {
         Cachorro c = new Cachorro();
        c.setNome("Rex");
        c.setIdade(3);

        Gato g = new Gato();
        g.setNome("Mimi");
        g.setIdade(2);

        c.emitirSom();
        g.emitirSom();
    }
}
