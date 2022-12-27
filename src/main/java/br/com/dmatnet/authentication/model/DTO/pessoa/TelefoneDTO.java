package br.com.dmatnet.authentication.model.DTO.pessoa;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TelefoneDTO implements Serializable, Cloneable, Comparable<TelefoneDTO> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelefone;
    private String numeroTelefone;
    private TelefoneTipoDTO tipoTelefone;

    @Override
    public TelefoneDTO clone() throws CloneNotSupportedException {
        return (TelefoneDTO) super.clone();
    }

    @Override
    public int compareTo(TelefoneDTO outroTelefone) {
        if (outroTelefone.getNumeroTelefone().equals(this.getNumeroTelefone())) {
            return 0;
        }
        return -1;
    }
}
