package com.github.joffryferrater.authservice.domains;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object that stores group information. 
 * Authorizations are assigned to this group.
 * 
 * @author Joffry Ferrater
 *
 */
@Data 
@AllArgsConstructor
@NoArgsConstructor(force=true) //for JPA
@Entity
@Table(name="groups")
public class Group {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GROUP_ID")
	private Long id;
	
	@JsonProperty("Group_Name")
	@Column(unique=true)
	private final String groupName;
	
	@JsonProperty("Authorizations")
	@OneToMany(mappedBy="group", cascade=CascadeType.ALL)
	private final List<Authz> authorizations;
}
