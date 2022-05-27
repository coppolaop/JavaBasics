package entity;

public abstract class Conta {
    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private Cliente dono;

    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Double saldo, Cliente dono) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dono = dono;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
}
