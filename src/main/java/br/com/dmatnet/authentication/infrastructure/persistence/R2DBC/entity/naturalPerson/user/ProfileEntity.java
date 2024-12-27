package br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_perfis")
@Data
public class ProfileEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 2938086839928013787L;
    @Id
    private final String name;
    public final String getAuthority() {
        return this.name;
    }


}
