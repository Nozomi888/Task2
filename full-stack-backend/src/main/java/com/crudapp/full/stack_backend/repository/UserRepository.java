package com.crudapp.full.stack_backend.repository;

import com.crudapp.full.stack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
