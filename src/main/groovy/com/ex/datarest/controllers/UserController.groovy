package com.ex.datarest.controllers

import com.ex.datarest.models.User
import com.ex.datarest.repositories.UserRepository
import com.ex.datarest.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @Autowired
    UserService userService

    @Value('${role.name}')
    String roleName

    @GetMapping("/all")
    List<User> findAll(){
        println "Find all users"
        userService.findAll()
    }

    @GetMapping("user/{firstName}")
    User findByFirstName(@PathVariable String firstName){
        println "Find user by first name :  ${firstName}, roleName : ${roleName}"
        userService.findByFirstName(firstName)
    }

    @GetMapping("user/{firstName}/{lastName}")
    User findByFirstNameOrLastName(@PathVariable String firstName, @PathVariable String lastName){
        println "Find user by first name or last name :  ${firstName}"
        userService.findByFirstNameOrLastName(firstName, lastName)
    }

    @PostMapping("/user")
    void createUser(@RequestBody User user){
        userService.createUser(user)
        println "user is created ${user.firstName}"
    }

}
