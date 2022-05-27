package entity;

public class ContaPupanca extends Conta {
    private Double rendimentos;

    public ContaPupanca(Integer agencia, Integer numero, Double saldo, Cliente dono, Double rendimentos) {
        super(agencia, numero, saldo, dono);
        this.rendimentos = rendimentos;
    }

    public ContaPupanca() {
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(Double rendimentos) {
        this.rendimentos = rendimentos;
    }
}
