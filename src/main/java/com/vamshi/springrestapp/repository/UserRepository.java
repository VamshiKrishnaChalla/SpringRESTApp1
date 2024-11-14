package com.vamshi.springrestapp.repository;

import com.vamshi.springrestapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
