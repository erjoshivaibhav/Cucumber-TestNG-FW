Feature: Login2 

Scenario: Adding Customer2

Given Driver initilization
When User opens the application
When User logins with <username> and <password>
And User validate for successful login


Examples:
|username|password|
|mngr333302|dUhubUv|