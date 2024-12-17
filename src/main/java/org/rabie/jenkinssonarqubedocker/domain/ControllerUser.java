package org.rabie.jenkinssonarqubedocker.domain;

import org.rabie.jenkinssonarqubedocker.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerUser {

    private final UserRepository userRepository;
    public ControllerUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public String all() {
        return userRepository.findAll().toString();
    }
}
