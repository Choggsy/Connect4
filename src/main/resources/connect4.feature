Feature: Connect Four Game

  Scenario: Starting a new game
    Given a vertical grid with 7 columns and 6 rows is created
    Then a new empty board is created

  Scenario: Player makes a move
    Given a new game is created
    And player 1 selects pink pieces
    When player 1 makes a move in column 1
    Then a pink piece should be on the grid at position 1 x 1

  Scenario: Switching between players
    Given a new game is created
    And player 1 selects pink pieces
    And player 2 selects white pieces
    And player 1 makes a move in column 1
    When player 2 makes a move in column 1
    Then a white piece should be on the grid at position 1 x 2

  Scenario: Handling an invalid out of bounds move
    Given a new game is created
    And column 1 has 6 pieces in it
    When any player makes a move in column 1
    Then the player is prompted to select a different column


  Scenario: Winning the game
    Given a new game is created
    And player 1 selects pink pieces
    And player 1 has a piece at position 1 x 1
    And player 1 has a piece at position 2 x 1
    And player 1 has a piece at position 3 x 1

    When player 1 makes a move in column 4
    Then player 1 has won the game

  Scenario: Drawing the game
    Given a new game is created
    When there is a piece at every position
    Then the players have drawn the game

  Scenario: Losing the game
    Given a new game is created
    And player 2 selects pink pieces
    And player 2 has a piece at position 1 x 1
    And player 2 has a piece at position 2 x 1
    And player 2 has a piece at position 3 x 1

    When player 2 makes a move in column 4
    Then player 1 has lost the game

  Scenario: Ending the game
    Given the game has a result
    Then the game is adjourned