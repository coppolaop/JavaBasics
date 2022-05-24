package controller;

import entity.Cliente;

public class ClienteController {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setIdCliente(3);

        System.out.println(cliente.getIdCliente());
    }
}
