package com.github.joffryferrater.securityservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.securityservice.domain.OAuthClient;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestResource(path="clients", rel="clients")
public interface OAuthRepository extends CrudRepository<OAuthClient, Long> {

}
