
package com.mycompany.exrcheranca7;

public class ExrcHeranca7 {

    public static void main(String[] args) {
      ContaCorrente cc = new ContaCorrente();
        cc.setNumeroConta("001");
        cc.setSaldo(1000);
        cc.setLimite(500);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumeroConta("002");
        cp.setSaldo(2000);
        cp.setTaxaRendimento(0.05);

        cc.exibirDados();
        System.out.println();
        cp.exibirDados();
    }
}
