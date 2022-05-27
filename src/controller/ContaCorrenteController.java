package controller;

import entity.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrenteController {

    List<Conta> contas = new ArrayList<Conta>();

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void removeConta(Conta conta){
        contas.remove(conta);
    }
    public void debitarSaldo(double valor) {
        for (Conta conta : this.contas) {
            conta.setSaldo(conta.getSaldo()-valor);
        }
    }

    public void creditarSaldo(double valor) {
        for (Conta conta : this.contas) {
            conta.setSaldo(conta.getSaldo()+valor);
        }
    }

    public static void main(String[] args) {

    }
}
