package Aulas;

import entity.Cliente;

import java.util.Objects;

public class Aula3Cliente {

    private Integer idCliente;
    private Integer CPF;
    private String nome;
    private String telefone;
    private static final Boolean IS_HUMAN = true;

    public Aula3Cliente(){

    }
    public Aula3Cliente(Integer idCliente, Integer CPF, String nome, String telefone) {
        this.idCliente = idCliente;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public static void gritar(String frase) {
        System.out.println(frase + "!!!");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", CPF=" + CPF +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aula3Cliente cliente = (Aula3Cliente) o;
        return Objects.equals(CPF, cliente.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, CPF, nome, telefone);
    }

    public static void main(String[] args) {
        System.out.println("Operadores Lógicos:");
        System.out.println("&&:");
        System.out.println(true && true);  //true
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false);  //false

        System.out.println("||:");
        System.out.println(true || true);  //true
        System.out.println(true || false);  //true
        System.out.println(false || true);  //true
        System.out.println(false || false);  //false

        System.out.println(false & false);  //false
        System.out.println(false | false);  //false
        System.out.println();

        Integer valor1 = 1;
        valor1 += 3; //Equivalente a: valor1 = valor1 + 3
        System.out.println(valor1);
        valor1 -= 3; //Equivalente a: valor1 = valor1 - 3
        System.out.println(valor1);
        valor1 *= 3; //Equivalente a: valor1 = valor1 * 3
        System.out.println(valor1);
        valor1 /= 3; //Equivalente a: valor1 = valor1 / 3
        System.out.println(valor1);
        valor1 += 2;
        valor1 %= 2; //Equivalente a: valor1 = valor1 % 2
        System.out.println(valor1);

        System.out.println(!true != true);
        System.out.println(Aula3Cliente.IS_HUMAN);
        Aula3Cliente c1 = new Aula3Cliente();
        System.out.println(c1.IS_HUMAN);
        c1.gritar("OLA MUNDO");

        Aula3Cliente cliente = new Aula3Cliente(1, 111111, "Pedro", "21");
        Aula3Cliente cliente2 = new Aula3Cliente(2, 111111, "João", "22");
        System.out.println(cliente.equals(cliente2));

        Aula3Cliente cliente1 = new Aula3Cliente(1, 111111, "Pedro", "21");
        System.out.println(cliente == cliente1);

        System.out.println(cliente.hashCode());
    }
}
