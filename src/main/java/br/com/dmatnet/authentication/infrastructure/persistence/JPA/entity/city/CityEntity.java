package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.city;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="tbl_city")
@Data
public class CityEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 3)
	private String cityName;

	@ManyToOne
	@JoinColumn(name="state_id")
	private StateEntity State;

}
