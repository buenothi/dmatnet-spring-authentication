package br.com.dmatnet.authentication.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TelefoneTipo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelefoneTipo;
    private String tipo;

}
