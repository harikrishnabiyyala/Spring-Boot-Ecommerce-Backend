package com.techwithhari.Ecommerce_Backend.util;

import com.techwithhari.Ecommerce_Backend.model.User;
import com.techwithhari.Ecommerce_Backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AuthUtil {

    @Autowired
    UserRepository userRepository;

    public String loggedInEmail(){
        User user = getloggedInUser();
        return user.getEmail();
    }

    public Long loggedInUserId(){
        User user = getloggedInUser();
        return user.getUserId();
    }

    public User getloggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return userRepository.findByUserName(authentication.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + authentication.getName()));
    }

}