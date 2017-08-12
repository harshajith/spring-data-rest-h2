package com.ex.datarest.services

import com.ex.datarest.models.User
import com.ex.datarest.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository

    User[] findAll(){
        userRepository.findAll()
    }

    void createUser(User user){
        userRepository.save(user)
    }

    User findByFirstName(String firstName) {
        userRepository.findByFirstName(firstName)
    }

    User findByFirstNameOrLastName(String firstName, String lastName){
        userRepository.findByFirstNameOrLastName(firstName, lastName)
    }
}
