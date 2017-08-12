package com.ex.datarest.services

import com.ex.datarest.models.User
import org.springframework.stereotype.Component

@Component
interface UserService {

    User[] findAll()
    void createUser(User user)
    User findByFirstName(String firstName)
    User findByFirstNameOrLastName(String firstName, String lastName)

}
