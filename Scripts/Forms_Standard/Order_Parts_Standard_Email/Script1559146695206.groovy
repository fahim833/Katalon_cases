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

'Get the Desired URL'
String partsURL = WebUI.concatenate((([GlobalVariable.URLBase, GlobalVariable.URLStubParts]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Open the Desired URL'
WebUI.navigateToUrl(partsURL)

//Determine OEM Manufacturer
'Get the Site\'s OEM Franchise'
String oem = WebUI.executeJavaScript('return DDC.dataLayer.site.franchises;', null)

//Create Function for removing characters from String
def stripChars = { def string, def stripChars ->
    def list = ((string) as List)
    list.removeAll(((stripChars) as List))
    list.join()
}

//Remove opening [* and closing *] to get the OEM
String cleanOEM = stripChars(oem, '["]')

//Set Lead info based on OEM
switch (cleanOEM) {
    case 'audi':
        GlobalVariable.FirstName = 'Sendto'
		GlobalVariable.LastName = 'All'

        break
    case 'kia':
        GlobalVariable.LastName = 'Test'
        GlobalVariable.Email = 'ddcsupport@email.com'
        GlobalVariable.PhoneNumber = '111-222-3333'
        break
    default:
        break
}

'Enter the First Name'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/FirstName'), GlobalVariable.FirstName)

'Enter the Last Name'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/LastName'), GlobalVariable.LastName)

'Select Contact Preference: Email'
WebUI.selectOptionByLabel(findTestObject('Forms_Standard/Contact_Us/PreferredContact'), 'Email', false)

'Enter the Email Address'
WebUI.setText(findTestObject('Forms_Standard/Contact_Us/EmailAddress'), GlobalVariable.Email)

'Enter the Car Year'
WebUI.setText(findTestObject('Forms_Standard/Parts/Car_Year'), '2015')

'Enter the Car Make'
WebUI.setText(findTestObject('Forms_Standard/Parts/Car_Make'), 'Honda')

'Enter the Car Model'
WebUI.setText(findTestObject('Forms_Standard/Parts/Car_Model'), 'Accord')

'Enter the Car Part Number'
WebUI.setText(findTestObject('Forms_Standard/Parts/Car_Part_Number'), '0000')

'Submit the Form'
WebUI.click(findTestObject('Forms_Standard/Parts/SubmitButton'))

'Close the Browser'
WebUI.closeBrowser()

