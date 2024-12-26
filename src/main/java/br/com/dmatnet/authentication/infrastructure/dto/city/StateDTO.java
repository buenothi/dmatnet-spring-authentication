package br.com.dmatnet.authentication.infrastructure.dto.city;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StateDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    @NotNull
    @Size(min = 3)
    private String estadoSigla;
    @NotNull
    @Size(min = 3)
    private String estadoNome;
    @JsonManagedReference
    private List<CItyDTO> cidades;

}
