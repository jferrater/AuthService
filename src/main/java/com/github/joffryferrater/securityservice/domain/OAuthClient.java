package com.github.joffryferrater.securityservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * OAuth client domain.
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Data
@Table(name="OAuthClients")
public class OAuthClient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@JsonProperty("Client_ID")
	private final String clientId;
	
	@NotNull
	@JsonProperty("Client_SECRET")
	private final String clientSecret;
}
