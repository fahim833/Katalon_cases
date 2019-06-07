import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open the Browser'
WebUI.openBrowser('')

'Get the Desired URL'
String serviceURL = WebUI.concatenate((([GlobalVariable.URLBase, GlobalVariable.URLStubService]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Open the Desired URL'
WebUI.navigateToUrl(serviceURL)

'Determine OEM Manufacturer'
String oem = WebUI.executeJavaScript('return DDC.dataLayer.site.franchises;', null)

'Create Function for removing characters from String'
def stripChars = { def string, def stripChars ->
    def list = ((string) as List)

    list.removeAll(((stripChars) as List))

    list.join()
}

//Remove opening [* and closing *] to get the OEM
String cleanOEM = stripChars(oem, '["]')

println(cleanOEM)

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
WebUI.setText(findTestObject('Forms_Standard/FirstName'), GlobalVariable.FirstName)

'Enter the Last Name'
WebUI.setText(findTestObject('Forms_Standard/LastName'), GlobalVariable.LastName)

'Select Contact Preference: Email'
WebUI.selectOptionByLabel(findTestObject('Forms_Standard/Contact_Us/PreferredContact'), 'Email', false)

'Enter Email'
WebUI.setText(findTestObject('Forms_Standard/EmailAddress'), GlobalVariable.Email)

'Select Date'
WebUI.setText(findTestObject('Forms_Standard/ScheduleService/AppointmentDate'), '6/6/2020')

'Send Enter'
WebUI.sendKeys(findTestObject('Forms_Standard/ScheduleService/AppointmentDate'), Keys.chord(Keys.ENTER))

'Select Contact Preference: Email'
WebUI.selectOptionByLabel(findTestObject('Forms_Standard/ScheduleService/AppointmentTime'), 'Morning', false)

WebUI.setText(findTestObject('Forms_Standard/ScheduleService/Year'), '2015')

WebUI.setText(findTestObject('Forms_Standard/ScheduleService/Make'), 'Honda')

WebUI.setText(findTestObject('Forms_Standard/ScheduleService/Model'), 'Accord')

WebUI.click(findTestObject('Forms_Standard/ScheduleService/ServiceCoolantFlush'))

WebUI.click(findTestObject('Forms_Standard/ScheduleService/ServiceOilChange'))

WebUI.click(findTestObject('Forms_Standard/ScheduleService/ServiceSubmit'))

WebUI.closeBrowser()

