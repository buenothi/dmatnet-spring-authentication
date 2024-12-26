package br.com.dmatnet.authentication.domain.city;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class City implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    @NotNull
    @Size(min = 3)
    private String cityName;
    @JsonBackReference
    private State state;

}
