Feature: Sign Up Tests
@selenium @signup

  Scenario: Sign Up Test
    Given I navigate to WAES HomePage
    And I click the SignUp button
    And I set "orlando" as username in Sign Up Page
    And I set "1234" as password in Sign Up Page
    And I set "orlando" as name in Sign Up Page
    And I set "orlando@gmail.com" as email in Sign Up Page
    And I set "13"/"March"/"1985" in date of birth dropdowns
    And I click the Sign Up Page submit button
    Then I should see the New User Welcome message for the "orlando" user

      
