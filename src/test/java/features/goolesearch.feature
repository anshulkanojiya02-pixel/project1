Feature: search on googlesearch
#  Scenario: verify search on google search
#    Given user is on Practice website
#    When user click on PRACTICE
#    And user click on Test login page
#    Then user successfully enter the login page

  Scenario Outline: verify user is able to login
    Given user is on Practice website
    When user click on PRACTICE
    And user click on Test login page
    And user is on login page
    And user enter the <username> and <password>
    And user click on login button
    And user successfully login
    Then user is successfully logedin
    Then user click logout
    Examples:
    |username| password|
    |student |Password123|
    |incorrectUser|Password123|
    |student|incorrectPassword|

#  Scenario: verify user is able to login
#    Given user is on Practice website
#    When user click on PRACTICE
#    And user click on Test Exception
#    And user is on test Exception page
#    When user click on add button
##    And new row is added
#    When user enter new entry
#    And click on Save button
#    Then verify the saved message
  Scenario: verify user is able to login
    Given user is on Practice website
    When user click on PRACTICE
    And user click on Test Table
#    When select the JAVA
    When select python
#    And Uncheck Intermediate and Advanced
    And uncheck beginner
#    And Verify only beginner is visible
#    Then verify
    And user select 1000 enrolment
#    And verify all enrollments
    Then verify records
    And click on reset
    And verify language level and enrollment
    Then verify resetbutton is disabled
    And select sortby enrollment