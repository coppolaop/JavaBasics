package entity;

public class Telefone {
    private Integer ddd;
    private Integer numero;
    private Boolean possuiWhatsapp;

    public Telefone() {
    }

    public Telefone(Integer ddd, Integer numero, Boolean possuiWhatsapp) {
        this.ddd = ddd;
        this.numero = numero;
        this.possuiWhatsapp = possuiWhatsapp;
    }

    public Integer getDdd() {
        return ddd;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Boolean getPossuiWhatsapp() {
        return possuiWhatsapp;
    }

    public void setPossuiWhatsapp(Boolean possuiWhatsapp) {
        this.possuiWhatsapp = possuiWhatsapp;
    }
}
