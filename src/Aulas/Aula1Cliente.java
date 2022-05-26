package Aulas;

public class Aula1Cliente {
        private Integer idCliente;
        private Integer CPF;
        private String nome;
        private String telefone;

    public void dizerOi(){
        System.out.println("Olá, " + this.nome);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Variaveis trazidas pelos Argumentos do Main:");
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumento " + (i+1) + ": " + args[i]);
        }
        Aula1Cliente c1 = new Aula1Cliente();
        c1.nome = "Marcos";
        c1.telefone = "21";

        Aula1Cliente c2 = new Aula1Cliente();
        c2.telefone = "21";
        c2.nome = "Felipe";

        c1.dizerOi();
        c2.dizerOi();

        Boolean valor = false;

        Character caracter = 'c';
        String nome = "minhastring";

        System.out.println(valor);
    }
}
