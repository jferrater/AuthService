package com.github.joffryferrater.authservice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.github.joffryferrater.authservice.domains.Permission;
import com.github.joffryferrater.authservice.domains.Role;

/**
 * Rest repository for managing roles.
 * 
 * @author Joffry Ferrater
 *
 */
@RestResource(path="roles", rel="roles")
public interface RoleRepository extends CrudRepository<Role, Long>{

	List<Permission> findPermissionsByRole(String role);
}
