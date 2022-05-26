package Aulas;

import entity.Cliente;
import entity.Conta;
import entity.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Aula4Cliente extends Aula4Pessoa implements Aula4Motorista {
    private String parceiro;
    private Telefone[] telefones = new Telefone[2];

    @Override
    public void falar(){
        super.falar();
        System.out.println("Bem Vindo");
    }

    public static void main(String[] args) {
        Aula4Cliente cliente = new Aula4Cliente();
        cliente.setNome("Marcos");
        System.out.println(cliente.getNome());
        cliente.falar();

        Aula4Pessoa pessoa = new Aula4Cliente();
        pessoa.setNome("João");

        Aula4Motorista motorista = new Aula4Cliente();
        motorista.dirigir();

        List<Telefone> telefones = new ArrayList<Telefone>();
        Telefone telefoneFixo = new Telefone(21,344,false);
        telefones.add(telefoneFixo);
        Cliente cliente2 = new Cliente("Marcos", "111", true, telefones);
        Conta conta = new Conta(001, 001, 0.0, cliente2);

        System.out.println(conta.getDono().getTelefones().get(0).getNumero());
    }

    @Override
    public void dirigir() {
        System.out.println("Estou Dirigindo");
    }
}
