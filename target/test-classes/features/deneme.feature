@all
Feature:
  @test1
  Scenario: Go to <Blog> page and scroll it down
    Given the user in the main page
    When the user click on the "Blog" button
    Then the user verify the blog page is displayed
    Then the user scroll the page down

    @test2
    Scenario: Go to <About> page, scroll it down and click on Twitter
    icon at the bottom of the page
      Given the user iis in the main page
      When the user click on the "About Us" button
      Then the user scroll the page down
      And the user click on the "Twitter" icon