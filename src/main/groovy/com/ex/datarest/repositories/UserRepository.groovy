package com.ex.datarest.repositories

import com.ex.datarest.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends JpaRepository<User, Long> {


    List<User> findAll()
    User findByFirstName(String firstName)
    User findByFirstNameOrLastName(String firstName, String lastName)



}