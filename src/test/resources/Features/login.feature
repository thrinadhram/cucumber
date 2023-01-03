#Author: swathi

Feature:sign in Feature
Scenario: Login verification using Username Password
Given launch application
When Enter Username
And Enter Password
And click Login
Then Homepage Display
Then Click PIM empmodule
