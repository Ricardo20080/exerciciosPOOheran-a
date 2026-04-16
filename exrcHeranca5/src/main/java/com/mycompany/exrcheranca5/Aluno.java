
package com.mycompany.exrcheranca5;


public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
}
