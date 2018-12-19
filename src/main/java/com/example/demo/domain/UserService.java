package com.example.demo.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Bean
    public void addUser() {
        userRepository.save(new User(1, "a"));
    }
}
