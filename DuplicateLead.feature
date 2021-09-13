Feature: Duplicate Lead functionality of Test Taps application
 #@regression
Scenario Outline: TC003_Duplicate Lead
Given Click on Find Lead
And Click email tab
And Enter email id as <Emailid>
And Click find Lead button from email tab
And Get the firstname from the Lead list table and Click on it
And Get the Title of the page
And Get the firstname from Duplicate Lead screen
And Click create Lead button from Duplicate lead Screen
When Check the existing Lead first name and duplicate lead created firstname is same
Then Duplicate lead is created

Examples:
|Emailid|
 |'dhivyap@gmail.com'|