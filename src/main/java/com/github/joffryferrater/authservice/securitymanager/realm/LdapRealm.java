package com.github.joffryferrater.authservice.securitymanager.realm;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.ldap.DefaultLdapRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.joffryferrater.authservice.domains.Authz;

/**
 * Custom shiro ldap realm.
 * 
 * @author Joffry Ferrater
 *
 */
public class LdapRealm extends DefaultLdapRealm {

	@Autowired
	private Authz authz;
	
	@Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo authzInfo = new SimpleAuthorizationInfo();
		authzInfo.setRoles(authz.getRoles());
		return authzInfo;
	}
}
