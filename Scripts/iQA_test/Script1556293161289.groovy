import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ricardomartinezsandbox.cms.dealer.com/')

WebUI.click(findTestObject('Object Repository/iQA_test/Page_Ricardos cars  New Volkswagen Dealership in Burlington VT/a_About Our Dealership'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_Ricardos cars  New Volkswagen Dealership in Burlington VT/a_About Us'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_About  Ricardos cars/div_Hours Monday 8AM - 7PMTuesday 8AM - 7PMWednesday 8AM - 7PMThursday 8AM - 7PMFriday 8AM - 7PM'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('iQA_test/Page_About  Ricardos cars/div_Hours Monday 8AM - 7PMTuesday 8AM - 7PMWednesday 8AM - 7PMThursday 8AM - 7PMFriday 8AM - 7PM'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_About  Ricardos cars/a_About Our Dealership'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_About  Ricardos cars/a_Contact Us'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_Contact Us  Ricardos cars/div_Hours Monday 8AM - 7PMTuesday 8AM - 7PMWednesday 8AM - 7PMThursday 8AM - 7PMFriday 8AM - 7PM'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('iQA_test/Page_Contact Us  Ricardos cars/div_Hours Monday 8AM - 7PMTuesday 8AM - 7PMWednesday 8AM - 7PMThursday 8AM - 7PMFriday 8AM - 7PM'), 
    0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/iQA_test/Page_Contact Us  Ricardos cars/input__contactfirstName'), 'Dealer', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/iQA_test/Page_Contact Us  Ricardos cars/input__contactlastName'), 'Dotcom', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/iQA_test/Page_Contact Us  Ricardos cars/input_Email_contactemail'), 'ddc_123@email.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/iQA_test/Page_Contact Us  Ricardos cars/button_Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

