Feature: ELMO QA Test

  @ScenarioA
  Scenario Outline: Test 1 - Scenario-A
    Given User is already on ELMO Home page
    And Click on Solutions navigation menu
    When Click on HR Core menu
    Then Verify HR Core page url "<ExpectedURL>"
    And Verify Key Benifits text in the HR Core page "<KeyBenefits>"
    When Click on Payroll from the dropdown "<SelectValue>"
    Then Verify Seamless cloud-based payroll and HR solution exists in the page "<PayrollText>"

    Examples: 
      | ExpectedURL                                    | KeyBenefits  | SelectValue | PayrollText                                  |
      | https://elmosoftware.com.au/solutions/core-hr/ | Key Benefits | Payroll     | Seamless cloud-based payroll and HR solution |

  @ScenarioB
  Scenario Outline: Test 1 - Scenario-B
    Given User is already on ELMO Careers page
    Then Verify Browse Jobs button exists in the careers page
    And Open Search Jobs url "<JobsURL>"
    When Enter Software Engineer in search jobs text field "<SearchJoB>"
    And Select job type as Permanent Full Time
    When Click on Search button
    Then Verify search returns Back End Software Engineer at Sydney Locations "<BackEnd>" and "<Location>" and "<JobType>"
    Then Verify search returns Full Stack Software Engineer at Sydney Locations "<FullStack>" and "<Location>" and "<JobType>"

    Examples: 
      | JobsURL                           | SearchJoB         | BackEnd                    | FullStack                    | Location | JobType               |
      | https://elmosoftware.com.au/jobs/ | Software Engineer | Back End Software Engineer | Full Stack Software Engineer | Sydney   | Permanent - Full Time |
