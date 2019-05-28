import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open the Browser'
WebUI.openBrowser('')

'Get the Desired URL'
String contactURL = WebUI.concatenate((([GlobalVariable.URLBase, GlobalVariable.URLStubContact]) as String[]), FailureHandling.STOP_ON_FAILURE)

'Open the Desired URL'
WebUI.navigateToUrl(contactURL)

List listElements = WebUiCommonHelper.findWebElements(findTestObject('MegaMenu/Megamenu'), 30)

println listElements.size()
println(listElements)

