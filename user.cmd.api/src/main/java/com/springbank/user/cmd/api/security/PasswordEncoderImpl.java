package com.springbank.user.cmd.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoderImpl implements PasswordEncoder {
    @Override
    public String hashedPassword(String password) {
        var bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

        return bCryptPasswordEncoder.encode(password);
    }
}
