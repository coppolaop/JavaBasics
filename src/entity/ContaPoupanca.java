package entity;

public class ContaPoupanca extends Conta {
    private Double rendimentos;

    public ContaPoupanca(Integer agencia, Integer numero, Double saldo, Cliente dono, Double rendimentos) {
        super(agencia, numero, saldo, dono);
        this.rendimentos = rendimentos;
    }

    public ContaPoupanca() {
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(Double rendimentos) {
        this.rendimentos = rendimentos;
    }
}
