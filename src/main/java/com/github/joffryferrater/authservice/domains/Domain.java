package com.github.joffryferrater.authservice.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="Domains")
@Data
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Domain {

	@Id 
	@Column(name="Domain_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private final String name;
	private final String description;
	
	@OneToMany(mappedBy="Domain", cascade=CascadeType.ALL)
	private IdmProvider idmProvider;
}
