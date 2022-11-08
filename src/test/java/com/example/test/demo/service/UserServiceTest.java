package com.example.test.demo.service;


import com.example.test.demo.UserService;
import com.example.test.demo.constance.Constance;
import com.example.test.demo.dto.UserDTO;
import com.example.test.demo.exception.InvalidUserException;
import com.example.test.demo.model.User;
import com.example.test.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.lenient;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    // Test add user with various inputs
    @Test
    void validInputs()
    {
        UserDTO testInput = new UserDTO("John", "John@gmail.com",20);
        User s = new User( "John", 20, "John@gmail.com");
        lenient().when(userRepository.save(s)).thenReturn(s);
        boolean result = userService.addUser(testInput);
        Assertions.assertTrue(result);
    }

    @Test
    void invalidAge(){
        UserDTO testInput = new UserDTO("John", "john@gmail.com", 150);
        InvalidUserException thrown = assertThrows(
                InvalidUserException.class,
                () -> userService.addUser(testInput)
        );
        Assertions.assertTrue(thrown.getMessage().contains(Constance.INVALID_AGE));
    }
    // Test get user with good and bad inputs mocking good and bad responses
    @Test
    void invalidEmail(){
        UserDTO testInput = new UserDTO("John", "jniioeon", 50);
        lenient().when(userRepository.findByEmailAddress("jniioeon")).thenReturn(Optional.empty());
        InvalidUserException thrown = assertThrows(
                InvalidUserException.class,
                () -> userService.addUser(testInput)
        );
        Assertions.assertTrue(thrown.getMessage().contains(Constance.INVAlID_EMAIL));
    }
    // Test delete user with good and bad inputs mocking good and bad responses
}
