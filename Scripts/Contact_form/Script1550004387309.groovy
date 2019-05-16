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

WebUI.navigateToUrl(GlobalVariable.BaseURL)

String contactURL = WebUI.concatenate((([GlobalVariable.BaseURL, GlobalVariable.ContactURLStub]) as String[]), FailureHandling.STOP_ON_FAILURE)
String aboutURL = WebUI.concatenate ((([GlobalVariable.BaseURL, GlobalVariable.AboutUsURLStub]) as String[]), FailureHandling.CONTINUE_ON_FAILURE)

//System.out.println(contactURL)//


WebUI.navigateToUrl(aboutURL)
WebUI.navigateToUrl(contactURL)

//WebUI.click(findTestObject('Object Repository/Contact_form/Page_About  Syeds Audi/a_About Our Dealership'))//

//WebUI.click(findTestObject('Object Repository/Contact_form/Page_About  Syeds Audi/a_Contact Us'))//

WebUI.setText(findTestObject('Contact_form/Page_Contact Us  Syeds Audi/input__contact.firstName'), 'Dealer')

WebUI.setText(findTestObject('Contact_form/Page_Contact Us  Syeds Audi/input__contact.lastName'), 'Dotcom')

WebUI.setText(findTestObject('Contact_form/Page_Contact Us  Syeds Audi/input_Email_contact.email'), 'ddc_123@email.com')

WebUI.closeBrowser()



