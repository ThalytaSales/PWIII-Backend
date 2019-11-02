package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table (name="CleanWorld")
@Entity
@Setter
@Getter


public class TiposMaterial {
	
	@Column (name="idTiposMaterial")
	@GeneratedValue
	@Id
	private Long idTiposMaterial;
	
	
	@Column (name="dsTiposMaterial")
	private String dsTiposMaterial;

}
