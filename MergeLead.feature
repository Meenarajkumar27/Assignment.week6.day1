Feature: Duplicate Lead functionality of Test Taps application
 @regression
Scenario Outline: TC003_Duplicate Lead
Given Click on Merge Leads link
And Select  From Lead and To Lead by <fname1> and <fname2>
And Click Merge button
And Click on Find Lead 
And Click on Find Lead link
And Enter the LeadID in the Find by section
When Click on Find Lead Button
Then No record should display

Examples:
|fname1|fname2|
|'meena'|'divya'|
