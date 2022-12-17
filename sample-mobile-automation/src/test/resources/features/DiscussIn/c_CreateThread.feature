Feature: Create Thread
  As a user
  I want to create thread
  So I can post the thread

  Scenario Outline: Create Thread with Title, content, and photo
    Given I am on the home page
    And I click Create Thread button
    When I input "<title>" title "<content>" content and "<photo>" photo
    And I click discuss.In button
    Then I will get the "<post>" post
    Examples:
      |title|content|photo |post   |
      |null | null  | null |failed |
      |null |null   |upload|failed |
      |null |write  |null  |failed |
      |write|null   |null  |failed |
      |null |write  |upload|failed |
      |write|write  |null  |failed |
      |write|null   |upload|failed |
      |write|write  |upload|success|