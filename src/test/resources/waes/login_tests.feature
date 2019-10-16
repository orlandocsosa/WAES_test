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

  Scenario: Check Admin Users Table
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "hero" as password
    And I click the LoginPage Login button
    Then I should see a table with the following users and emails
    | Name                | e-mail                  |
    | Amazing Admin       | a.admin@wearewaes.com   |
    | Al Skept-Cal Tester | as.tester@wearewaes.com |
    | Zuper Dooper Dev    | zd.dev@wearewaes.com    |

  Scenario: Logout Test
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "hero" as password
    And I click the LoginPage Login button
    Then I should see the Welcome message for the "admin" user
    When I click the Logout button
    Then I should see "To get the full hero experience, you’ll need to log in." message in status component

  Scenario: Validation Login no username and password
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I click the LoginPage Login button
    Then I should see "To get the full hero experience, you’ll need to log in." message in status component
  
  Scenario: Validation Login no username
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "" as username
    And I set "hero" as password
    And I click the LoginPage Login button
    Then I should see "To get the full hero experience, you’ll need to log in." message in status component

  Scenario: Validation Login no password
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "" as password
    And I click the LoginPage Login button
    Then I should see "To get the full hero experience, you’ll need to log in." message in status component

  Scenario: Validation Login invalid password
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "wizard" as password
    And I click the LoginPage Login button
    Then I should see "Wrong credentials. You can do it, try again!" message in status component


      
