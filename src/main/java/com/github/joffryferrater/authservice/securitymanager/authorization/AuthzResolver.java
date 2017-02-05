package com.github.joffryferrater.authservice.securitymanager.authorization;

import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.RolePermissionResolver;

/**
 * 
 * @author Joffry Ferrater
 *
 */
public class AuthzResolver implements RolePermissionResolver {

	@Override
	public Collection<Permission> resolvePermissionsInRole(String roleString) {
		// TODO Auto-generated method stub
		return null;
	}

}
