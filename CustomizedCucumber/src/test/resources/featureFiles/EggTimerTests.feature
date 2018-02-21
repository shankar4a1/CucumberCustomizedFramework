Feature: user enters value to start the count down timer
Description : user enters value to start the count down timer

@component
Scenario Outline:

Given user is on Home page
When  he enters <countdowntime>
And clicks on Go button
Then EggTimer count down should start for <countdowntime>

Examples:

    | countdowntime |
    |  "2 minutes"  |
    |  "20"   |