/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exrcheranca6;

/**
 *
 * @author samsung
 */
public class ExrcHeranca6 {

    public static void main(String[] args) {
          ProdutoEletronico e = new ProdutoEletronico();
        e.setNome("TV");
        e.setPreco(2000);
        e.setVoltagem(220);

        ProdutoAlimenticio a = new ProdutoAlimenticio();
        a.setNome("Leite");
        a.setPreco(5.5);
        a.setDataValidade("10/10/2026");

        e.exibirDados();
        System.out.println();
        a.exibirDados();
    }
}
