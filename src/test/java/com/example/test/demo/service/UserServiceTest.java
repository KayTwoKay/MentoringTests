package com.example.test.demo.service;


import com.example.test.demo.UserService;
import com.example.test.demo.repository.UserRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    // Test add user with various inputs

    // Test get user with good and bad inputs mocking good and bad responses

    // Test delete user with good and bad inputs mocking good and bad responses
}
