package com.example.test.demo.service;

import com.example.test.demo.dto.UserDTO;
import com.example.test.demo.exception.InvalidUserException;
import com.example.test.demo.model.User;
import com.example.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public boolean addUser(UserDTO dto){
        if(dto.getAge() < 0 || dto.getAge() > 120){
            throw new InvalidUserException("Invalid age for user");
        }else if(userRepository.findByEmailAddress(dto.getEmailAddress()).isPresent()){
            throw new InvalidUserException("Email already exists");
        }
        userRepository.save(new User(dto.getName(), dto.getAge(), dto.getEmailAddress()));
        return true;
    }

    public UserDTO getUser(Long id){
       User entity = userRepository.findById(id).orElseThrow(() -> new InvalidUserException("No user with that id"));
        return new UserDTO(entity.getName(), entity.getEmailAddress(), entity.getAge());
    }

    public boolean deleteUser(Long id){
        User entity = userRepository.findById(id).orElseThrow(() -> new InvalidUserException("No user with that id"));
        userRepository.delete(entity);
        return true;
    }

}
