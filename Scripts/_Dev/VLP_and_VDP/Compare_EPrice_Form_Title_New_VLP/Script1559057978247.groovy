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

'Open the Browser'
WebUI.openBrowser('')

'Get the Desired URL'
String newVLPURL = WebUI.concatenate((([GlobalVariable.URLBase, GlobalVariable.URLStubNewVLP]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Open the Desired URL'
WebUI.navigateToUrl(newVLPURL)

'Get the XPath for the Price Field'
int n = 1

String valueXPath = WebUI.concatenate((([findTestObject('VLP_Listing/VLP_New_Item'), '[', n, ']', findTestObject('VLP_Listing/VLP_New_Price')]) as String[]), 
    FailureHandling.STOP_ON_FAILURE)

println(valueXPath)

WebUI.click(findTestObject(null))

