package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;
import br.newtonpaiva.dominio.ContaEspecial;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);
//        c.depositar(-20.0);

        Conta c2 = new Conta();
        c2.setNumero(10);
        c2.setSaldo(500.0);

        Conta c3 = new Conta();

        if (c.equals(c2)) {
            System.out.println("Mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(c.getSaldo());

        ContaEspecial ce = new ContaEspecial();
        ce.setNumero(20);
        ce.setSaldo(100.0);
        ce.setLimite(100.0);
        ce.sacar(200.0);
    }
}
