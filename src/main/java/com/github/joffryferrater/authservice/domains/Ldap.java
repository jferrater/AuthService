package com.github.joffryferrater.authservice.domains;

import com.github.joffryferrater.authservice.domains.Idm.IdmType;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * Ldap object
 * 
 * @author Joffry Ferrater
 *
 */
@AllArgsConstructor
public class Ldap extends IdmProvider {

	@Getter
	private final String username;
	@Getter
	private final String password;
	@Getter
	private final String dnTemplate;
	@Getter
	private final String url;
	@Getter
	private final String searchBase;
	
	@Override
	public IdmType getIdmType() {
		return IdmType.LDAP;
	}

}
