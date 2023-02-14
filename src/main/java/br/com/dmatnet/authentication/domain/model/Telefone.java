package br.com.dmatnet.authentication.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class Telefone implements Serializable, Cloneable, Comparable<Telefone> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelefone;
    private String numeroTelefone;
    private TelefoneTipo tipoTelefone;

    @Override
    public Telefone clone() throws CloneNotSupportedException {
        return (Telefone) super.clone();
    }

    @Override
    public int compareTo(Telefone outroTelefone) {
        if (outroTelefone.getNumeroTelefone().equals(this.getNumeroTelefone())) {
            return 0;
        }
        return -1;
    }
}
