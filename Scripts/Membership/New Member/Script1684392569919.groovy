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

WebUI.navigateToUrl(GlobalVariable.url + '/Membership/Members/Create?MembershipStatus=Draft')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Membership - NUSS/h2_New Member'), 'New Member')

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/md-tab-item_Company'), 'COMPANY')

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/md-tab-item_Education Level'), 'EDUCATION LEVEL')

WebUI.verifyElementText(findTestObject('Page_Membership - NUSS/md-tab-item_Contact'), 'CONTACT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Membership'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Subscription Fee'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Credit Limit'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Payment Mode'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Family'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Membership - NUSS/md-tab-item_Car park'), 0)

