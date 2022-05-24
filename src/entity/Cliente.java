package entity;

public class Cliente {
    private String nome;
    private String telefone;
    private int valor;

    public void dizerOi(){
        System.out.println("Olá " + this.nome);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        Cliente c1 = new Cliente();
        c1.nome = "Marcos";
        c1.telefone = "21";

        Cliente c2 = new Cliente();
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
