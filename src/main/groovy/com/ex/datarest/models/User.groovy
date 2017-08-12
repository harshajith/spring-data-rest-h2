package com.ex.datarest.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {

    @Id
    @GeneratedValue
    Long id
    String firstName
    String lastName
    String address





}
