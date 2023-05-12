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

WebUI.navigateToUrl(GlobalVariable.url + '/Accounting')

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Bank Accounts'))

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Journal Entries'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/button_New Journal Entry'), '+ NEW JOURNAL ENTRY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/button_Export'), 'EXPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/a_Bulk Upload'), 'BULK UPLOAD')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Journal Items'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/button_Export_1'), 'EXPORT')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Recurring Journal Entries'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/button_New Recurring Journal Entry'), 
    '+ NEW RECURRING JOURNAL ENTRY')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Budget'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/a_Budget Maintenance'), 'BUDGET MAINTENANCE')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Reporting'))

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Trial Balance'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/span_Trial Balance Settings'), 'Trial Balance Settings')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/span_Trial Balance Report'), 'Trial Balance Report')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Financial Reports'))

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_General Ledger Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/h2_General Ledger Report'), 'General Ledger Report')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/span_Report Settings'), 'Report Settings')

WebUI.click(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Configuration'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Account Books'), 'Account Books')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Fiscal Years'), 'Fiscal Years')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Journals'), 'Journals')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Account Groups'), 'Account Groups')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Account Types'), 'Account Types')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Accounts'), 'Accounts')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Taxes'), 'Taxes')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Dimensions'), 'Dimensions')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Reports'), 'Reports')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Report Views'), 'Report Views')

WebUI.verifyElementText(findTestObject('Object Repository/Page_GeneralLedger - NUSS/p_Budget Code'), 'Budget Code')

