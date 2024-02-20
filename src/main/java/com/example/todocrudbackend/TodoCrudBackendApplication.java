package com.example.todocrudbackend;

import com.example.todocrudbackend.entity.Role;
import com.example.todocrudbackend.entity.User;
import com.example.todocrudbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class TodoCrudBackendApplication {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public ApplicationRunner runner(){
        return r -> {
            Role role1 = new Role();
            role1.setName("ADMIN");
            Role role2 = new Role();
            role2.setName("USER");

            User user1 = new User();
            user1.setName("John Doe");
            user1.setUsername("john");
            user1.setPassword(passwordEncoder.encode("12345"));
            user1.setEmail("john@gmail.com");

            User user2 = new User();
            user2.setName("Mary");
            user2.setUsername("mary");
            user2.setPassword(passwordEncoder.encode("12345"));
            user2.setEmail("mary@gmail.com");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoCrudBackendApplication.class, args);
    }

}
