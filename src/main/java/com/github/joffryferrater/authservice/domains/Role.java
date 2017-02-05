package com.github.joffryferrater.authservice.domains;

import java.util.List;
import java.util.concurrent.ConcurrentMap;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object for managing role.
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="Roles")
@Data
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Role {

	@Id 
	@Column(name="Role_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	private final String role;
	
	@OneToMany(mappedBy="Role", cascade=CascadeType.ALL)
	private final ConcurrentMap<String, List<Permission>> permisisons;
}
