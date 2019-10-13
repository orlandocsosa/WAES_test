Feature: Is it Friday yet?
@selenium

  Scenario: Test
    Given A user navigates WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "hero" as password
    And I click the LoginPage Login button