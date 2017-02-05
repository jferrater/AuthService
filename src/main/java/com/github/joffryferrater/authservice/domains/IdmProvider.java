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
import com.github.joffryferrater.authservice.securitymanager.IdentityProvider;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abstract class for identity providers.
 * 
 * @author Joffry Ferrater
 *
 */
@Entity
@Table(name="IdmProviders")
@Data
@NoArgsConstructor(force=true)
public abstract class IdmProvider implements IdentityProvider {

	@Id 
	@Column(name="IdmProvider_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="Domain_Id")
	@JsonIgnore
	private final Domain domain;
}
