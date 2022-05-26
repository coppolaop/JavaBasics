package Aulas;

public class Aula2Cliente {
    private Integer idCliente;
    private Integer CPF;
    private String nome;
    private String telefone;

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public Aula2Cliente(Integer idCliente, Integer CPF, String nome, String telefone) {
        this.idCliente = idCliente;
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Aula2Cliente(String nome) {
        this.nome = nome;
    }

    public Aula2Cliente() {

    }
    public void dizerOi(){
        String saudacao = "Olá, ";
        System.out.println(saudacao + this.nome);
    }

    public static void main(String[] args) {
        Aula2Cliente cliente = new Aula2Cliente(1, 111111, "Pedro", "21");
        System.out.println(cliente.nome);

        Aula1ContaCorrente conta = new Aula1ContaCorrente();

        System.out.println(conta.numeroDaConta); //FUNCIONOU
        System.out.println(conta.saldo); //FUNCIONOU
        //System.out.println(conta.Info1); //ERRO
        System.out.println(conta.Info2); //FUNCIONOU

        cliente.dizerOi();

            //Operadores Aritiméticos
        System.out.println("Operadores Aritiméticos:");
        System.out.println("Soma: " + (3 + 3));
        System.out.println("Subtração: " + (3 - 3));
        System.out.println("Multiplicação: " + (3 * 3));
        System.out.println("Divisão: " + (3 / 3));
        System.out.println("Resto sem sobra: " + (3 % 3));
        System.out.println("Resto com sobra: " + (3 % 2));
        System.out.println();

            // Operadores Incremento/Decremento
        System.out.println("Operadores Incremento/Decremento:");
        Integer v = 1;
        v--;
        System.out.println(v);
        v++;
        System.out.println(v);
        System.out.println();

            //Operador Igualdade
        System.out.println("Operadores Igualdade:");
        System.out.println(1 == 2);
        System.out.println();

            //Operadores Relacionais
        System.out.println("Operadores Relacionais:");
        System.out.println(1 < 2);  //true
        System.out.println(2 < 2);  //false
        System.out.println(1 > 2);  //false
        System.out.println(2 > 2);  //false
        System.out.println(1 <= 2); //true
        System.out.println(2 <= 2); //true
        System.out.println(1 >= 2); //false
        System.out.println(2 >= 2); //true
        System.out.println();
    }
}
