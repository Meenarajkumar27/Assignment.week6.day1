Feature: Login functionality of Test Taps application
#Background:
#Given Open the chrome browser
#And Load the application 'http://leaftaps.com/opentaps/'
 @regression
Scenario Outline: TC001_Create Lead
Given Click on create Lead Button
And Enter firstname field as <fname>
And Enter Lastname field as <Lastname>
And Enter the Company name <company>
And Enter the phone number <phone>
When Click on submit Button
Then Lead should be created


Examples:
|fname|Lastname|company|phone|
|'Meena'|'Rajkumar'|'CTS'|'99'|




