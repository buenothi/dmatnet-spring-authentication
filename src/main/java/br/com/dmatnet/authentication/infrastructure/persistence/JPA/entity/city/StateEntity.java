package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.city;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl_state")
@Data
/*@NamedQueries({
        @NamedQuery(name = "Estados.listarTodasCidadesPorEstado",
                query = "SELECT cid FROM CidadeEntity cid WHERE cid.estado=:estado")})*/
public class StateEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Size(min = 3)
    private String stateAcronym;

    @NotNull
    @Size(min = 3)
    private String stateName;

    @OneToMany(mappedBy = "State")
    private List<CityEntity> cities;

}
