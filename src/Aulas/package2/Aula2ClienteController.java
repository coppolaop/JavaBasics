package Aulas.package2;

import Aulas.Aula2Cliente;

public class Aula2ClienteController {

    public static void main(String[] args) {
        Aula2Cliente cliente = new Aula2Cliente();

        cliente.setIdCliente(3);

        System.out.println(cliente.getIdCliente());
    }
}
