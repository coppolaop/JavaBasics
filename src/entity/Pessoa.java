package entity;

public abstract class Pessoa {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void testePassagem2(Pessoa pessoa){
        pessoa.nome = "Mateus";
    }
    public static void testePassagem(String nome){
        nome = "Mateus";
    }

    public static void main(String[] args) {
        String nome = "Juliano";
        testePassagem(nome);
        System.out.println(nome);

//        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Renan";
//        testePassagem2(pessoa);
//        System.out.println(pessoa.nome);
//
//        Pessoa pessoa2 = pessoa;
//        testePassagem2(pessoa);
//        System.out.println(pessoa.nome);
//        System.out.println(pessoa2.nome);
    }
}
