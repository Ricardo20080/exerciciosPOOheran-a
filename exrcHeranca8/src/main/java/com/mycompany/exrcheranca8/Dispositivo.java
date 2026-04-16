
package com.mycompany.exrcheranca8;


public class Dispositivo {
    private String marca;
    private String modelo;

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public void exibirDados() {
        System.out.println(marca + " " + modelo);
    }
}