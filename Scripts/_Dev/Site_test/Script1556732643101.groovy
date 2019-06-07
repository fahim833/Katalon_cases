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

WebUI.navigateToUrl('https://autogalleryimportswestbury2.cms.dealer.com/')

WebUI.click(findTestObject('Site_Test/Page_Syeds Audi  New Audi Dealershi/a_About Our Dealership'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.getUrl(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Site_Test/Page_Syeds Audi  New Audi Dealershi/a_About Us'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Site_Test/Page_About  Syeds Audi/div_Hours Monday 8AM - 7PMTues'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Site_Test/Page_About  Syeds Audi/div_Hours Monday 8AM - 7PMTues'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Site_Test/Page_About  Syeds Audi/a_About Our Dealership'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Site_Test/Page_About  Syeds Audi/a_Contact Us'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Site_Test/Page_Contact Us  Syeds Audi/div_Hours Monday 8AM - 7PMTues'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Site_Test/Page_Contact Us  Syeds Audi/div_Hours Monday 8AM - 7PMTues'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.CONTINUE_ON_FAILURE)

