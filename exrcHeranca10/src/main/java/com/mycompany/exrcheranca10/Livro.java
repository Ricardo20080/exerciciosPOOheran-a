
package com.mycompany.exrcheranca10;
public class Livro extends ItemBiblioteca {
    private String autor;

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Autor: " + autor);
    }
}
