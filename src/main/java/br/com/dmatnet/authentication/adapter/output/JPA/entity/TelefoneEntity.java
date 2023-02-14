package br.com.dmatnet.authentication.adapter.output.JPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_telefone")
@Getter
@Setter
@NoArgsConstructor
public class TelefoneEntity implements Serializable, Cloneable, Comparable<TelefoneEntity> {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefone;
    private String numeroTelefone;
    @ManyToOne
    @JoinColumn(name = "TELEFONETIPO_ID")
    private TelefoneTipoEntity tipoTelefone;

    @Override
    public TelefoneEntity clone() throws CloneNotSupportedException {
        return (TelefoneEntity) super.clone();
    }

    @Override
    public int compareTo(TelefoneEntity outroTelefone) {
        if (outroTelefone.getNumeroTelefone().equals(this.getNumeroTelefone())) {
            return 0;
        }
        return -1;
    }
}
