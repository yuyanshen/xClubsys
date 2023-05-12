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

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_Absent For E-Circulation'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_ChatBot Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_Members For Circulation'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_Recommended Products Analytics'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_Sales Analytics'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard - NUSS/h2_Sales Analytics'), 'Sales Analytics')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/p_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/span_Pending Tasks'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/span_Requests'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard - NUSS/span_Participation'), 'Participation')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard - NUSS/span_Delegations'), 'Delegations')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Dashboard'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_General Ledger'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Membership'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Membership AR'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Invoicing'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Rewards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_eCommerce'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_ChatBot'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Inventory'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Procurement'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Budget'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Logging'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_News'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Services'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Sports Club'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_AR'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_BPM'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Reports'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Studio'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard - NUSS/div_setting                Settings'), 
    0)

