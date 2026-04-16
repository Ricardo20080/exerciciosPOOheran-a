
package com.mycompany.exrcheranca2;


public class ExrcHeranca2 {

    public static void main(String[] args) {
       Gerente g = new Gerente();

        g.setNome("Carlos");
        g.setSalario(5000);
        g.setDepartamento("TI");

        g.exibirDados();
    }
}
