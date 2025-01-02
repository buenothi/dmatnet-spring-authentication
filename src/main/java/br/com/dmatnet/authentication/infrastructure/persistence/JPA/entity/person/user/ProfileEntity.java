package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ProfileEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 2938086839928013787L;
    @Id
    private String name;

}
