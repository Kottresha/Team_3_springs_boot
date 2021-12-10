package com.ltts.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltts.Entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
