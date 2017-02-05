package com.github.joffryferrater.authservice.securitymanager;

import org.apache.shiro.realm.Realm;

/**
 * Generic realm interface.
 * 
 * @author Joffry Ferrater
 *
 * @param <T>
 */
@FunctionalInterface
public interface IRealm<T extends Realm> {

	T getRealm();
}
