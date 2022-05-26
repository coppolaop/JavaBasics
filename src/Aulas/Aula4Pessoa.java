package Aulas;

public abstract class Aula4Pessoa {
    private String nome;
    private String cpf;

    public Aula4Pessoa() {

    }

    public Aula4Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void falar(){
        System.out.println("OI");
    }

    public void falar(String palavra){
        System.out.println(palavra);
    }

    public void falar(Integer numero, Integer numero2){
        System.out.println(numero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
