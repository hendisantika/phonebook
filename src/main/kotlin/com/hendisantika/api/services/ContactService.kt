package com.hendisantika.api.services

import com.hendisantika.api.model.Contact
import com.hendisantika.api.repository.ContactRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service(value = "contactService")
class ContactService {

    @Autowired
    lateinit var repository: ContactRepository

    fun getAllContact(): Iterable<Contact> = repository.findAll()

    fun getContactById(id: Long): Contact = repository.findContactById(id)

    fun addContact(contact: Contact): Contact = repository.save(contact)

    fun deleteContactById(id: Long) = repository.delete(id)
}