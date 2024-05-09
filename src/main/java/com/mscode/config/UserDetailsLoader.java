package com.mscode.config;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsLoader {

    UserDetails loadUserByUsername(String username);
}
