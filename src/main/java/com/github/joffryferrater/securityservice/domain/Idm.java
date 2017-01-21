package com.github.joffryferrater.securityservice.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Domain for Identity Management data
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table (name="Idm")
@Data
public class Idm {


	public enum IdmType {
		OAUTH,
		AD,
		LDAP,
		MYSQL;
	}
	
	@JsonProperty("IDM_Type")
	private final IdmType idmType;
	
	@JsonProperty("Name")
	private final String name;
	

}
