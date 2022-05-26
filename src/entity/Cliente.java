package entity;

import java.io.Serializable;
import java.util.Objects;

public class Cliente extends Pessoa implements Serializable {
    private Integer idCliente;
    private Integer CPF;
    private String nome;
    private String telefone;
}
