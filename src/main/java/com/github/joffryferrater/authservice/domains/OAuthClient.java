package com.github.joffryferrater.authservice.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * OAuth client domain.
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Data
@Table(name="OAuthClients")
@NoArgsConstructor(force=true)
@AllArgsConstructor
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
