package com.springbank.user.cmd.api.security;

public interface PasswordEncoder {

    String hashedPassword(String password);
}
