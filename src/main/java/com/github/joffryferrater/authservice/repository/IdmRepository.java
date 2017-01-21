package com.github.joffryferrater.authservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.authservice.domain.Idm;

/**
 *  
 * @author Joffry Ferrater
 *
 */
@RestResource(path="identity_providers", rel="identity_providers")
public interface IdmRepository extends CrudRepository<Idm, Long>{

}
