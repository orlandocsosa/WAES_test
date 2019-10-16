Feature: Extra Tests
@selenium @extra

 Scenario Outline: Check Details Page Data
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "<username>" as username
    And I set "<password>" as password
    And I click the LoginPage Login button
    Then I should see the Welcome message for the "<username>" user
    When I click the Details Link
    Then I should see "<name>" and "<email>" in Details page

    Examples:
    | username | password | name                | email                   |
    | admin    | hero     | Amazing Admin       | a.admin@wearewaes.com   |
    | dev      | wizard   | Zuper Dooper Dev    | zd.dev@wearewaes.com    |
    | tester   | maniac   | Al Skept-Cal Tester | as.tester@wearewaes.com |

   Scenario: Home Link Test
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I click the Heroes Profile button
    Then I should see the "WAES Tester Assignment" title

   Scenario: Profile Link Test
    Given I navigate to WAES HomePage
    And I click the LogIn button
    And I set "admin" as username
    And I set "hero" as password
    And I click the LoginPage Login button
    Then I should see the Welcome message for the "admin" user
    When I click the Details Link
    And I click the Profile Link
    Then I should see the Welcome message for the "admin" user

   Scenario: WAES Link check
    Given I navigate to WAES HomePage
    And I click the WAES Link
    And I should see WAES url
      
