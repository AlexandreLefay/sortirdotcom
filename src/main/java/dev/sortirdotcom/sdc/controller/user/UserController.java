package dev.sortirdotcom.sdc.controller.user;

import dev.sortirdotcom.sdc.domain.user.User;
import dev.sortirdotcom.sdc.repository.user.UserRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value ="api/users", produces = APPLICATION_JSON_VALUE)
public class UserController {

    private final UserRepository userRepository;

    // Injectez le repository via le constructeur
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Find all users
     *
     * @return User List
     */
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<User> findAll() {
        // Utilisez le repository pour récupérer la liste des utilisateurs
        return userRepository.findAll();
    }
}
