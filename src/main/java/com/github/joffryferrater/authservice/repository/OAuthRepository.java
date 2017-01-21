package com.github.joffryferrater.authservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.authservice.domain.OAuthClient;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestResource(path="clients", rel="clients")
public interface OAuthRepository extends CrudRepository<OAuthClient, Long> {

}
