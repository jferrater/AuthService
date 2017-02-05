package com.github.joffryferrater.authservice.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object for managing role's permissions
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="Permissions")
@Data
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Permission {

	@Id 
	@Column(name="Permission_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	
	private final String permission;
	
	@ManyToOne
	@JoinColumn(name="Role_Id")
	@JsonIgnore
	private final Role role;
}
