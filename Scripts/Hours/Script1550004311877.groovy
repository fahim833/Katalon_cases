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

WebUI.click(findTestObject('Object Repository/Hours/Page_Syeds Audi  Audi Dealership in/a_AboutOur Dealership'))

WebUI.click(findTestObject('Object Repository/Hours/Page_Syeds Audi  Audi Dealership in/a_About Us'))

WebUI.click(findTestObject('Hours/Page_About  Syeds Audi/div_Hours Monday 8AM - 7PMTues'))

WebUI.click(findTestObject('Object Repository/Hours/Page_About  Syeds Audi/h3_Hours'))

WebUI.closeBrowser()

