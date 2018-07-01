package com.learnjava.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.learnjava.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByUsername(String username);
}
