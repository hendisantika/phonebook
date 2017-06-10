package com.hendisantika.api.repository

import com.hendisantika.api.model.Contact
import org.springframework.data.repository.CrudRepository

interface ContactRepository : CrudRepository<Contact, Long> {

    fun findContactById(id: Long): Contact
}