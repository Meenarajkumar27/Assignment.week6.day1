Feature: Duplicate Lead functionality of Test Taps application
 #@regression
Scenario Outline: TC003_Duplicate Lead
Given Click on Find Lead 
And Click on Phone from findby
And Enter the phone number to Edit <phone>
And Click on Find Lead Button
And Select the Lead from the Table List
And Click delete button
And Click on Find Lead
And Search the Deleted Lead ID
When No record is displayed
Then Lead is deleted

Examples:
|phone|
|'99'|
