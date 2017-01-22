package com.github.joffryferrater.authservice.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Stores authorization info
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="Authzs")
@Data
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Authz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("Role")
	private final String role;
	
	@JsonProperty("Action")
	private final String action;
	
	@JsonProperty("Resource")
	private final String resource;
	
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	@JsonIgnore
	private static Group group;
}
