# Java Spring Boot Security Module

A simple security module using Spring security. It has a auth controller with the following endpoints:
- /register
- /login
- /csrf-token

And a user controller with the following endpoints:
- /               --> getAllUsers()
- /{username}     --> getUserByUsername(username)
