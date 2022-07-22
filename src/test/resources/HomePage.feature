Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Rediffmail"
And close the browser

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed
And close the browser

Scenario: Login with correct credentials
Given user is on login page
When user enters username "satishgangwani19"
And user enters password "Sati1234$"
And user clicks on Login button
Then user gets the logout link on the page
And user click on logout link
And close the browser