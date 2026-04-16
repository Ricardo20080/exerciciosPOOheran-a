
package com.mycompany.exrcheranca5;


public class ExrcHeranca5 {

    public static void main(String[] args) {
        Professor p = new Professor();
        p.setNome("eder");
        p.setCpf("123");
        p.setDisciplina("informatica");

        Aluno a = new Aluno();
        a.setNome("ricardo");
        a.setCpf("456");
        a.setMatricula("2024");

        p.exibirDados();
        System.out.println();
        a.exibirDados();
    }
}
