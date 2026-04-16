
package com.mycompany.exrcheranca1;


public class ExrcHeranca1 {

    public static void main(String[] args) {
       
        Aluno a = new Aluno();

        a.setNome("Ricardo");
        a.setIdade(18);
        a.setMatricula("001");
        a.setCurso("TI");

        a.exibirDados();
    }
}
