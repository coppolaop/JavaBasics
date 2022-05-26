package entity;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private Boolean parceiro;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Boolean parceiro, List<Telefone> telefones) {
        super(nome, cpf);
        this.parceiro = parceiro;
        this.telefones = telefones;
    }

    public Boolean getParceiro() {
        return parceiro;
    }

    public void setParceiro(Boolean parceiro) {
        this.parceiro = parceiro;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }

    public void removeTelefone(Telefone telefone){
        this.telefones.remove(telefone);
    }
}
