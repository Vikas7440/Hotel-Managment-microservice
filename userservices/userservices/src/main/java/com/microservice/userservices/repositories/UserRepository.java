package com.microservice.userservices.repositories;

import com.microservice.userservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
