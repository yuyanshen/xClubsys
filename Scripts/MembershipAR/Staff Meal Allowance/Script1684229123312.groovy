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

WebUI.navigateToUrl(GlobalVariable.url + '/MembershipAR/AR/StaffMealAllowance/List')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/h2_Staff Meal Allowance List'), 'Staff Meal Allowance List')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/span_Borne By Club'), 'Borne By Club')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/span_Borne By Staff'), 'Borne By Staff')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/span_Basic Meal Allowance'), 'Basic Meal Allowance')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/span_Next Tier Subsidised Allowance'), 
    'Next Tier Subsidised Allowance')

