#Autor: Juan David Camacho Guevara
@stories
Feature: Automatize Utest register form
  As a user, I want to fill the register form in the Utest page using screenplay
  @scenario1
  Scenario Outline: Register in Utest
    Given that Juan wants to register on the Utest page
    When he fills the registry form with his data
      |strFname  |strLname  |strEmail  |strLanguage  |strCity  |strZip  |strCountry  |strComputer  |strVersion  |strClanguage  |strMobile  |strMobilem  |strMobilev  |strPassword  |
      |<strFname>|<strLname>|<strEmail>|<strLanguage>|<strCity>|<strZip>|<strCountry>|<strComputer>|<strVersion>|<strClanguage>|<strMobile>|<strMobilem>|<strMobilev>|<strPassword>|
    Then he creates his new account successfully
      |strEmail  |strPassword  |strValidation  |
      |<strEmail>|<strPassword>|<strValidation>|
    Examples:
      | strFname | strLname | strEmail      | strLanguage | strCity | strZip | strCountry | strComputer | strVersion | strClanguage | strMobile | strMobilem | strMobilev | strPassword   | strValidation                                                                                       |
      | Juan     | Camacho  | juan2@test.com | spanish     | Bogotá  | 110121 | Colombia   | Windows     | Windows 11 | English      | Samsung   | Galaxy S10 | Android 12 | Choucair2022* | We're so excited for you to get started on uTest, but first you need to confirm your email address. |
