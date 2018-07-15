package com.learnjava.repository;


import org.springframework.data.ldap.repository.LdapRepository;

import com.learnjava.model.Person;
public interface PersonRepository extends LdapRepository<Person>{
	Person findByPhone(String phone);
}
