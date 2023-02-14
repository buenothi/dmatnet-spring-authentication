package br.com.dmatnet.authentication.adapter.output.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_Logradouro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoTipoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNomeLogradouro;
    private String siglaLogradouro;
    private String nomeLogradouro;

}
