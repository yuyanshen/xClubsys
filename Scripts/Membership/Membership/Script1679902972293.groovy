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

WebUI.navigateToUrl(GlobalVariable.url + '/Membership/Members/list')

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Active'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Draft'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Pending'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Absent'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Suspended'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Terminated'))

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/a_New Member'), 'NEW MEMBER')

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/a_Batch Update Credit Limit'), 'BATCH UPDATE CREDIT LIMIT')

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/a_Batch Update pSOA'), 'BATCH UPDATE PSOA')

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Committee'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Completed'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Voided'))

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/a_New Committee Member'), 'NEW COMMITTEE MEMBER')

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Transfer'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Life Conversion'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/h2_Life Conversion'), 'Life Conversion')

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Renewal'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Conversion'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_ID Change'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Status Change'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Absent Member'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Lost Card Replacement'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Resignation'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Card Printing'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Batch Settings'))

WebUI.click(findTestObject('Object Repository/Page_Membership - NUSS/p_Hong Bao Contribution'))

