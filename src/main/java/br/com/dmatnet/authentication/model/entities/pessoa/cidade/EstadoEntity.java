package br.com.dmatnet.authentication.model.entities.pessoa.cidade;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl_estados")
@Getter
@Setter
@NamedQueries({
        @NamedQuery(name = "Estados.listarTodasCidadesPorEstado",
                query = "SELECT cid FROM CidadeEntity cid WHERE cid.estado=:estado")})
@AllArgsConstructor
@NoArgsConstructor
public class EstadoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @Size(min = 3)
    private String estadoSigla;
    @NotNull
    @Size(min = 3)
    private String estadoNome;
    @OneToMany(mappedBy = "estado")
    private List<CidadeEntity> cidades;


}
