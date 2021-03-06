package com.learnjava.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.learnjava.model.CustomUserDetails;
import com.learnjava.model.Users;
import com.learnjava.repository.UserRepository;
@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> users = userRepository.findByUsername(username);
		users.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		return users.map(CustomUserDetails::new).get();
	}

}
