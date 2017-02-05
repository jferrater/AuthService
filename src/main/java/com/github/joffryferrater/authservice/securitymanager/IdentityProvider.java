package com.github.joffryferrater.authservice.securitymanager;

import com.github.joffryferrater.authservice.domains.Idm.IdmType;

/**
 * Provides interface for identity providers.
 * 
 * @author Joffry Ferrater
 *
 */
public interface IdentityProvider {

	IdmType getIdmType();
}
