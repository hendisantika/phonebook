package com.hendisantika.api.controller

import com.ukdw.api.model.Contact
import com.hendisantika.api.services.ContactService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/*")
class ContactController {

    @Autowired
    lateinit var contactService: ContactService

    @GetMapping("v1/contacts")
    fun getContacts() = contactService.getAllContact()

    @GetMapping("v1/contact/{id}")
    fun getContact(@PathVariable id: Long) = contactService.getContactById(id)

    @PostMapping("v1/contact/create")
    fun createContact(@RequestBody contact: Contact) = contactService.addContact(contact)

    @DeleteMapping("v1/contact/remove")
    fun removeContact(@RequestBody id: Long) = contactService.deleteContactById(id)
}