package entity;

import java.io.Serializable;
import java.util.Objects;

public class Cliente extends Pessoa implements Serializable {

    private Integer idCliente;
    private Integer CPF;
    private String nome;
    private String telefone;

    private static final Boolean IS_HUMAN = true;

    public Cliente(Integer idCliente, Integer CPF, String nome, String telefone) {
        this.idCliente = idCliente;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    public static void gritar(String frase) {
        System.out.println(frase + "!!!");
    }

    public void dizerOi(){
        String saudacao = "Olá, ";
        System.out.println(saudacao + this.nome);
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
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
        Cliente cliente = (Cliente) o;
        return Objects.equals(CPF, cliente.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, CPF, nome, telefone);
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        for(int i = 0; i < args.length; i++){
//            System.out.println(args[i]);
//        }
//        Cliente c1 = new Cliente();
//        c1.nome = "Marcos";
//        c1.telefone = "21";
//
//        Cliente c2 = new Cliente();
//        c2.telefone = "21";
//        c2.nome = "Felipe";
//
//        c1.dizerOi();
//        c2.dizerOi();
//
//        Boolean valor = false;
//
//        Character caracter = 'c';
//        String nome = "minhastring";
//
//        System.out.println(valor);

        //AULA 2
//        Cliente cliente = new Cliente(1, 111111, "Pedro", "21");
//        System.out.println(cliente.nome);
//
//        ContaCorrente conta = new ContaCorrente();
//
//        System.out.println(conta.numeroDaConta); //FUNCIONOU
//        System.out.println(conta.saldo); //FUNCIONOU
////        System.out.println(conta.Info1); //ERRO
//        System.out.println(conta.Info2); //FUNCIONOU
//
//        cliente.dizerOi();
//
//            //Operadores Aritiméticos
//        System.out.println("Soma: " + (3 + 3));
//        System.out.println("Subtração: " + (3 - 3));
//        System.out.println("Multiplicação: " + (3 * 3));
//        System.out.println("Divisão: " + (3 / 3));
//        System.out.println("Resto sem sobra: " + (3 % 3));
//        System.out.println("Resto com sobra: " + (3 % 2));
//
//            // Operadores Incremento/Decremento
//        Integer v = 1;
//        v--;
//        System.out.println(v);
//        v++;
//        System.out.println(v);
//
//            //Operador Igualdade
//        System.out.println(1 == 2);
//
//            //Operadores Relacionais
//        System.out.println(1 < 2);  //true
//        System.out.println(2 < 2);  //false
//        System.out.println(1 > 2);  //false
//        System.out.println(2 > 2);  //false
//        System.out.println(1 <= 2); //true
//        System.out.println(2 <= 2); //true
//        System.out.println(1 >= 2); //false
//        System.out.println(2 >= 2); //true

        //AULA 3
//        System.out.println("Operadores Lógicos:");
//        System.out.println("&&:");
//        System.out.println(true && true);  //true
//        System.out.println(true && false);  //false
//        System.out.println(false && true);  //false
//        System.out.println(false && false);  //false
//
//        System.out.println("||:");
//        System.out.println(true || true);  //true
//        System.out.println(true || false);  //true
//        System.out.println(false || true);  //true
//        System.out.println(false || false);  //false
//
//        System.out.println(false & false);  //false
//        System.out.println(false | false);  //false
//
//        Integer valor1 = 1;
//        valor1 += 3; //Equivalente a: valor1 = valor1 + 3
//        System.out.println(valor1);
//        valor1 -= 3; //Equivalente a: valor1 = valor1 - 3
//        System.out.println(valor1);
//        valor1 *= 3; //Equivalente a: valor1 = valor1 * 3
//        System.out.println(valor1);
//        valor1 /= 3; //Equivalente a: valor1 = valor1 / 3
//        System.out.println(valor1);
//        valor1 += 2;
//        valor1 %= 2; //Equivalente a: valor1 = valor1 % 2
//        System.out.println(valor1);
//
//        System.out.println(!true != true);
//        System.out.println(Cliente.IS_HUMAN);
//        Cliente c1 = new Cliente();
//        System.out.println(c1.IS_HUMAN);
//        c1.gritar("OLA MUNDO");

        Cliente cliente = new Cliente(1, 111111, "Pedro", "21");
        Cliente cliente2 = new Cliente(2, 111111, "João", "22");
//        System.out.println(cliente.equals(cliente2));

        Cliente cliente1 = new Cliente(1, 111111, "Pedro", "21");
//        System.out.println(cliente == cliente1);

        System.out.println(cliente.hashCode());
    }
}
