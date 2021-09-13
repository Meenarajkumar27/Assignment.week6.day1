Feature: Edit Lead functionality of Test Taps application
@functional
Scenario Outline: TC002_Edit Lead
Given Click on Find Lead 
And Click on Phone from findby
And Enter the phone number to Edit <phone>
And Click on Find Lead Button
And Select the Lead from the Table List
And Click on Edit Button
And Update company name as <company>
When Click on update button
Then Edited Lead details updated

Examples:
|phone|company|
|'99'|'CTS'|