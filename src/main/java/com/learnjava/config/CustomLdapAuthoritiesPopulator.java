package com.learnjava.config;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;

public class CustomLdapAuthoritiesPopulator implements LdapAuthoritiesPopulator {

	@Override
	public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations userData,
			String username) {
		Collection<GrantedAuthority> gas = new HashSet<>();
		if (username.equals("ben")) {
			gas.add(new SimpleGrantedAuthority("ADMIN"));
		}
		gas.add(new SimpleGrantedAuthority("user"));
		return gas;
	}

}
