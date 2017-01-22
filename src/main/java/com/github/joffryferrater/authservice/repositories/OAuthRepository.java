package com.github.joffryferrater.authservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.authservice.domains.OAuthClient;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestResource(path="clients", rel="clients")
public interface OAuthRepository extends CrudRepository<OAuthClient, Long> {

}
