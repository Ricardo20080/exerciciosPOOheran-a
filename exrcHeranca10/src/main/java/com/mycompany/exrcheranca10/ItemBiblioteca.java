
package com.mycompany.exrcheranca10;


public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoPublicacao);
    }
}
