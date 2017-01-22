package com.github.joffryferrater.authservice.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Domain for Identity Management data
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table (name="Idm")
@Data
@NoArgsConstructor(force=true)
@AllArgsConstructor
public class Idm {


	public enum IdmType {
		OAUTH,
		AD,
		LDAP,
		MYSQL;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonProperty("IDM_Type")
	private final IdmType idmType;
	
	@JsonProperty("Name")
	private final String name;
	

}
