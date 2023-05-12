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

WebUI.navigateToUrl(GlobalVariable.url + '/Invoicing')

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Purchases'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Bill'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Credit Note'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Repeating Bill'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Payment'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Payment Approval'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Giro Payment'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Statement'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Posting GL'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Deferred Expenses'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Invoicing - NUSS/a_New Deferred Expense'), 0)

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Supplier'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Suppliers'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Supplier Sequence Config'))

WebUI.click(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Report'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Invoicing - NUSS/button_Export'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Invoicing - NUSS/p_Payment Listing'), 'Payment Listing')

