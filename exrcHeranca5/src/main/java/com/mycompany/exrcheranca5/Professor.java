
package com.mycompany.exrcheranca5;


public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}
