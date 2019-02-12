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

WebUI.navigateToUrl('http://syedrahmansandbox.cms.dealer.com/')

WebUI.click(findTestObject('Object Repository/Schedule_form/Page_Syeds Audi  Audi Dealership in/a_ServiceYour Vehicle'))

WebUI.click(findTestObject('Object Repository/Schedule_form/Page_Syeds Audi  Audi Dealership in/a_Service Appointment Request'))

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input__contact.firstName'), 
    'Dealer')

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input__contact.lastName'), 
    'Dotcom')

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input_Email Address_contact.em'), 
    'ddc_123@email.com')

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input__year'), '2010')

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input__make'), 'Audi')

WebUI.setText(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/input__model'), 'A3')

WebUI.click(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/label_Oil Change'))

WebUI.click(findTestObject('Object Repository/Schedule_form/Page_Service Center  Syeds Audi/button_Submit'))

WebUI.closeBrowser()

