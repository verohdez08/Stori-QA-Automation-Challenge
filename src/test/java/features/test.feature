
  Feature: Validation Practice Page
    Validation of elements practice page

    Scenario: Validation of radio button
      Given I should see the practice page
      Then I should see the section of radio button
      And I validate the options of radio button
      Then I close the page

    Scenario: Validation of dropdown
      Given I should see the practice page
      Then I should see the section of dropdown
      And I validate dropdown options
      Then I close the page

    Scenario: Validation of checkbox
      Given I should see the practice page
      Then I should see the section of checkbox
      And I validate checkbox options
      Then I close the page

    Scenario: Validation of switch alert
      Given I should see the practice page
      Then I should see the section of switch alert
      When I tap on text box
      And I write the "Stori Card"
      Then I tap on alert button
      Then I close the page

    Scenario: Validation of displayed element
      Given I should see the practice page
      And Validate element displayed
      Then I close the page

    Scenario: Validation of suggession class
      Given I should see the practice page
      Then I should see the section of sugession class
      When I tap on type select country
      Then I write the word "Yo"
      And I select Mexico in the list

    Scenario: Validation of all options page
      Given I should see the practice page
      Then I should see the section of radio button
      And I validate the options of radio button
      Then I should see the section of dropdown
      And I validate dropdown options
      Then I should see the section of checkbox
      And I validate checkbox options
      Then I should see the section of switch alert
      When I tap on text box
      And I write the "Stori Card"
      Then I tap on alert button
      And Validate element displayed
      Then I close the page
