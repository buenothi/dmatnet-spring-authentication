package br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity;

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
public class TelephoneEntity implements Serializable, Cloneable, Comparable<TelephoneEntity> {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefone;
    private String numeroTelefone;
    @ManyToOne
    @JoinColumn(name = "TELEFONETIPO_ID")
    private TelephoneTypeEntity tipoTelefone;

    @Override
    public TelephoneEntity clone() throws CloneNotSupportedException {
        return (TelephoneEntity) super.clone();
    }

    @Override
    public int compareTo(TelephoneEntity outroTelefone) {
        if (outroTelefone.getNumeroTelefone().equals(this.getNumeroTelefone())) {
            return 0;
        }
        return -1;
    }
}
