Feature: Create an Initial PD Prescription for a Patient
  @test @smoke
  Scenario:  Create a New Prescription for APD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly
    And   I create and save a new prescription

  @test @smoke
  Scenario:  Add Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check if in prescription history I can add

  @test @smoke
  Scenario:  Save Prescription with at least one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to save a recipe with at least one required field empty.

  @test @smoke
  Scenario:  Cancel Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to create a new prescription but I click the cancel button

  @test @smoke
  Scenario:  Prescription History
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that Previous Recipes will be displayed on the left and Active Recipes on the right, with their respective date.

  @test @smoke
  Scenario:  Add Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create and add a new Exchange

  @test @smoke
  Scenario:  Assistant View
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check that the information for each solution and a delete button are displayed

  @test @smoke
  Scenario:  Solutions View
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I do Click on each label to drag and drop the desired solutions

  @test @smoke
  Scenario:  View Parameter Adjustments (for APD Treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I check The system hides details

  @test @smoke
  Scenario:  Assign Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that the system assigned the Questionnaire

  @test @smoke
  Scenario:  New Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create and save the new Questionnaire

  @test @smoke
  Scenario:  Create a New Prescription for CAPD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I create a new CAPD prescription and verify that it is in history

  @test @smoke
  Scenario:  Save Prescription with at least one field with wrong value entered
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    And   I try to create a new Prescription, but the system cancels the prescription

  @test @smoke
  Scenario:  Delete Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I verify that The system will delete the selected change line

  @test @smoke
  Scenario:  Save Prescription without selecting a Weekdays
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 12, Sharesource - SHS11912"
    And   I open PD Prescription module
    And   I'm trying to create a new prescription without Weekdays required

  @test @smoke
  Scenario:  Cancel Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to create a new prescription, but I click on the cancel button

  @test @smoke
  Scenario:  Cancel New Questionnaire
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to create a new questionnaire, but I click on the cancel button

  @test @smoke
  Scenario:  Save prescription for APD Treatment with Infusion volume greater than the Total volume
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to save the prescription for APD treatment with an infusion volume greater than the total volume, but the system cancels the prescription

  @test @smoke
  Scenario:  Save Prescription for CAPD Treatment without concentrations in the exchanges
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to save the prescription for CAPD treatment without concentrations in the exchanges

  @test @smoke
  Scenario:  Save Prescription with low Treatment time
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to save the prescription for APD with low treatment time


  @test @smoke
  Scenario:  Add Biometric Markers same Biometric datum more than once
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I am trying to add biometric markers with the same biometric data more than once

  @test @smoke
  Scenario:  Save Biometric Markers with at least one Required field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    And   I try to create a new biometric market with an empty required field

