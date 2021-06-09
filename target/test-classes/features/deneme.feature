@all
Feature:
  @test1
  Scenario: Go to <Blog> page and scroll it down
    Given the user in the main page
    When the user click on the "Blog" button
    And the user scroll the page down
    Then the address of the company is displayed

    @test2
    Scenario: Go to <About> page, scroll it down and click on Twitter
    icon at the bottom of the page
      Given the user in the main page
      When the user click on the "About Us" button
      And the user scroll the page down
      And the user click on the "Twitter" icon
      Then the user verify the twitter page is displayed