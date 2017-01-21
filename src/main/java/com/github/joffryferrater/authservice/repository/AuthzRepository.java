package com.github.joffryferrater.authservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.authservice.domain.Authz;

/**
 * 
 * @author Joffry Ferrater
 *
 */
@RestResource(path="authorizations", rel="authorizations")
public interface AuthzRepository extends CrudRepository<Authz, Long>{

}
