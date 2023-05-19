import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url + '/Membership/Members/CardReplacement/List')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_Replacement Date'), 'Replacement Date')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_Old Card No'), 'Old Card No.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_New Card No'), 'New Card No.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_Transaction Date'), 'Transaction Date')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_Remarks'), 'Remarks')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/span_Latest Update Date'), 'Latest Update Date')

