package br.com.dmatnet.authentication.adapter.output.JPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_telefoneTipo")
@Getter
@Setter
@NoArgsConstructor
public class TelefoneTipoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefoneTipo;
    private String tipo;

}
