# Phonebook
Phonebook API


Create new contact
API --> `http://localhost:8080/api/v1/contact/create`
Body POST Request : 
```json
{
	"firstname":"Uzumaki",
	"lastname" : " Naruto",
	"email"   : "uzumaki_naruto@konohagakure.com",
	"phonenumber":   "081321411551"
	
}
```



Get All Contacts
`http://localhost:8080/api/v1/contacts`