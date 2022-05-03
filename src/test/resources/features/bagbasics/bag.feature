Feature: Bag functionalities

  Scenario: Putting one thing in the bag
    Given the bag is empty
    When I put 1 potato in the bag
    Then the bag should contain only 1 potato

  Scenario: Putting few things in the bag
    Given the bag is empty
    When I put 1 potato in the bag
    And I put 2 cucumbers in the bag
    Then the bag should contain only 1 potato
    And the bag should contain only 2 cucumbers
