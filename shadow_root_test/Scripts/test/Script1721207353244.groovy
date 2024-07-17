import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser("https://psilore.github.io/shadow-root/demo/")
String headerText = WebUI.getText(findTestObject('Object Repository/shadowHeaderElement'))
println(headerText)