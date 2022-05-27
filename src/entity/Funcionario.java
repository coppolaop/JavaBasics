package entity;

public class Funcionario extends Pessoa{
    private Double salario;

    public Funcionario(String nome, String cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public Funcionario() {

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
