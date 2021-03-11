Feature: Search by keyword

  Scenario: User is not able to register without date of birth
    Given web user navigates to gan home page
    When user selects option join now
    And user fills up title "Mr", first name "Test" & last name "Testtt"
    And user accepts terms & conditions for register form
    And user submits register form
    Then validation message with text "This field is required" appears under the date of birth box

