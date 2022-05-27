package entity;

public class ContaCorrente extends Conta{
    private Double taxa;

    public ContaCorrente(Integer agencia, Integer numero, Double saldo, Cliente dono, Double taxa) {
        super(agencia, numero, saldo, dono);
        this.taxa = taxa;
    }

    public ContaCorrente() {
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
