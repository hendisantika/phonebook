package com.hendisantika.api.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Contact constructor(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = 0,
        var firstname: String = "",
        var lastname: String = "",
        var email: String = "",
        var phonenumber: String = ""
)