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

WebUI.navigateToUrl(GlobalVariable.url + '/sales/promotion/coupon/template/list')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/h2_Template'), 'Template')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Title'), 'Title')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Cumulative with other coupons'), 'Cumulative with other coupons')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Start Time'), 'Start Time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_End Time'), 'End Time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Use Start Time'), 'Use Start Time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Use End Time'), 'Use End Time')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_DelayHours'), 'DelayHours')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Receive Count'), 'Receive Count')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Limited per customer'), 'Limited per customer')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Coupons Issued'), 'Coupons Issued')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - NUSS/span_Active'), 'Active')

