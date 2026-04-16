
package com.mycompany.exrcheranca10;


public class ExrcHeranca10 {

    public static void main(String[] args) {
        
           Livro l = new Livro();
        l.setTitulo("Java Básico");
        l.setAnoPublicacao(2020);
        l.setAutor("Autor X");

        Revista r = new Revista();
        r.setTitulo("Tech News");
        r.setAnoPublicacao(2023);
        r.setEdicao(45);

        l.exibirDados();
        System.out.println();
        r.exibirDados();
    }
}
