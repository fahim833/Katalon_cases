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

WebUI.navigateToUrl(contactURL)

WebUI.setText(findTestObject('Forms_Standard/Contact_Us/FirstName'), 'Test')

WebUI.setText(findTestObject('Forms_Standard/Contact_Us/LastName'), 'DealerCom')

WebUI.selectOptionByLabel(findTestObject('Forms_Standard/Contact_Us/PreferredContact'), 'Phone', false)

WebUI.setText(findTestObject('Forms_Standard/Contact_Us/PhoneNumber'), '8025555555')

WebUI.setText(findTestObject('Forms_Standard/Contact_Us/CommentForm'), 'This is a Test Lead to verify the Contact Us form functionality using Phone as preferred method.')

WebUI.click(findTestObject('Forms_Standard/Contact_Us/SubmitButton'))

WebUI.closeBrowser()

