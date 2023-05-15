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

WebUI.navigateToUrl(GlobalVariable.url + '/sales/sales/detailCollectionReport')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/h2_Detail Collection Report'), 'Detail Collection Report')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Receipt no'), 'Receipt no.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_DateTime'), 'Date/Time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Member ID'), 'Member ID')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Payment Mode'), 'Payment Mode')

WebUI.verifyElementText(findTestObject('Page_Sales - NUSS/span_Reference'), 'Reference')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Sub Total before Tax'), 'Sub Total before Tax')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_GST'), 'GST')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Payment Amount'), 'Payment Amount')

