package com.rsoukef.jsf.boot.jsfbootapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rsoukef.jsf.boot.jsfbootapp.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
