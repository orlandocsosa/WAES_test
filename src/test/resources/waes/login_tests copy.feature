Feature: Login Tests
@selenium @login

 Scenario Outline: Check Welcome Message
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "<username>" as username
    And I set "<password>" as password
    And I click the LoginPage Login button
    Then I should see the Welcome message for the "<username>" user

    Examples:
    | username | password | 
    | admin    | hero     | 
    | dev      | wizard   |
    | tester   | maniac   |

  Scenario Outline: Check User Superpower
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "<username>" as username
    And I set "<password>" as password
    And I click the LoginPage Login button
    Then I should show see following superpower: "<superpower>"

    Examples:
    | username | password | superpower                        |
    | admin    | hero     | Change the course of a waterfall  |
    | dev      | wizard   | Debug a repellent factory storage |
    | tester   | maniac   | Voltage AND Current               |

  # Scenario: Admin Users Table //TODO
  #   Given I navigate to WAES HomePage
  #   And I click the LogIn button
  #   And I set "admin" as username
  #   And I set "hero" as password
  #   And I click the LoginPage Login button
  #   Then I should see a table with the following users
  #   | Amazing Admin       |
  #   | Al Skept-Cal Tester |
  #   | Zuper Dooper Dev    |

    Scenario: Logout Test
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "hero" as password
    And I click the LoginPage Login button
    Then I should see the Welcome message for the "admin" user
    When I click the Logout button
    Then I should see the Login button from Login page


      
