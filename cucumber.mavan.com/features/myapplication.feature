Feature: Facebook Smoke Test

  Scenario Outline: Test Login with valid credential
    Given Open Chrome and start application
    When Enter valid "<userName>" and valid "<password>"
    Then user should be able to login into application sucessfully
    Then application shoud be closed

    Examples: 
      | userName                 | password  |
      | kumar.ajaywtp@gmail.com  | ajjkdjak  |
      | kumar.ajaywp@gmail.com   | ajjkdjak2 |
      | kumar.ajaywt1p@gmail.com | ajjkdjak2 |
