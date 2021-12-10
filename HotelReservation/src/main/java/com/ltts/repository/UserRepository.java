package com.ltts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ltts.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
