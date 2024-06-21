package com.crudapp.full.stack_backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User not found the user with id: " + id);
    }
}
