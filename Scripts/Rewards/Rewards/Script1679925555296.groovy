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

WebUI.navigateToUrl(GlobalVariable.url + '/FBRewards/FBCredits/List')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_Batch Import'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_Rewards Redemption'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_New Rewards'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_Adjustment Rewards'), 0)

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Rewards Transaction'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_Add Rewards Transaction'), 0)

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Posting GL'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/a_New Posting GL'), 0)

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Points Rule'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/a_Add Points Rule Template'), 'ADD POINTS RULE TEMPLATE')

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Template'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Shopping'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Comment'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Redeem'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Coupon'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Wallet'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/h2_Balance'), 'Balance')

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Transaction'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/h2_Transactions'), 'Transactions')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Rewards - NUSS/div_An error has occurred, please contact s_a7bcaa'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Configuration'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/h2_Indirect Referral And Bonus'), 'Indirect Referral And Bonus')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/md-tab-item_Indirect Referral And Bonus'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Rewards - NUSS/md-tab-item_General Information'), 0)

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Shopping Rebate'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/h2_Shopping Rebate'), 'Shopping Rebate')

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Rewards - NUSS/p_Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Rewards - NUSS/h2_Enquiry of Members Rewards List'), 'Enquiry of Members Rewards List')

