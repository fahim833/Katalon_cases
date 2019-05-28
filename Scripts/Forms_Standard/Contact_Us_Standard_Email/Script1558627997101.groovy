import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
//Delete after logging proves successful
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

KeywordLogger log = new KeywordLogger()

'Open the Browser'
WebUI.openBrowser('')

'Get the Desired URL'
String contactURL = WebUI.concatenate((([GlobalVariable.URLBase, GlobalVariable.URLStubContact]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Open the Desired URL'
WebUI.navigateToUrl(contactURL)

//Determine OEM Manufacturer
String oem = WebUI.executeJavaScript('return DDC.dataLayer.site.franchises;', null)

//Create Function for removing characters from String
def stripChars = { string, stripChars ->
	def list = string as List
	list.removeAll(stripChars as List)
	list.join()
}

//Remove opening [* and closing *] to get the OEM
String cleanOEM = stripChars(oem , '["]')
println(cleanOEM)

//Set Lead info based on OEM
switch (cleanOEM) {
    case 'audi':
        GlobalVariable.FirstName = 'Syed'
        GlobalVariable.LastName = 'Rahman'
        break
    case 'volkswagen':
        GlobalVariable.FirstName = 'Ricardo'
        GlobalVariable.LastName = 'Martinez'
        break
    default:
        break
}

//If certain OEM, change default pre-fill information.
'Enter the First Name'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/FirstName'), GlobalVariable.FirstName)

'Enter the Last Name'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/LastName'), GlobalVariable.LastName)

'Select Contact Preference: Email'
WebUI.selectOptionByLabel(findTestObject('Forms_Standard/Contact_Us/PreferredContact'), 'Email', false)

'Enter the Email Address'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/EmailAddress'), GlobalVariable.Email)

'Comment that this is a Test Lead'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/CommentForm'), 'This is a Test Lead to verify the Contact Us form functionality using Phone as preferred method.')

'Submit Form'
WebUI.click(findTestObject('Forms_Standard/Contact_Us/SubmitButton'))

WebUI.closeBrowser()

