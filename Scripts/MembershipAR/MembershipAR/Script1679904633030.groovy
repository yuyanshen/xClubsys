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

WebUI.navigateToUrl(GlobalVariable.url + '/MembershipAR/AR/Invoice/List')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Batch Import'), 'BATCH IMPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_New Debit Note'), 'NEW DEBIT NOTE')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Rollback Debit Note'), 'ROLLBACK DEBIT NOTE')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Repeating Debit Note'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Repeating Debit Note Report'), 'REPEATING DEBIT NOTE REPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_New  Repeating Debit Note'), 'NEW REPEATING DEBIT NOTE')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Credit Note'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Batch Import'), 'BATCH IMPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_New Credit Note'), 'NEW CREDIT NOTE')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Rollback Credit Note'), 'ROLLBACK CREDIT NOTE')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Deposit Adjustment'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Instalment'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Prepaid'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Export'), 'EXPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_New  Prepaid'), 'NEW PREPAID')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Payment History'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Cheque Batch Import'), 'CHEQUE BATCH IMPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_DBS Batch Import'), 'DBS BATCH IMPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Batch Import'), 'BATCH IMPORT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_New Payment'), 'NEW PAYMENT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Pay for reminder'), 'PAY FOR REMINDER')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Rollback Payment'), 'ROLLBACK PAYMENT')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Statement Enquiry'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Generate Data'), 'GENERATE DATA')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Month End Closing'), 'MONTH END CLOSING')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Electronic Statement'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Reminder'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Generate'), 'GENERATE')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Print'), 'PRINT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Adjustment'), 'ADJUSTMENT')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_History'), 'HISTORY')

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Setup'), 'SETUP')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Refund Deposit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_New Refund Transaction'), 'NEW REFUND TRANSACTION')

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Member Subscription Fee'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Generate  Subscription Fee'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MembershipAR - NUSS/button_Post Subscription Fee'), 0)

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Member Levy'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Post Member Levy'), 0)

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Member Penalty Fee'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MembershipAR - NUSS/a_Post Penalty Fee'), 0)

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Giro Payment'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Giro Payment Return'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Posting GL'))

WebUI.click(findTestObject('Object Repository/Page_MembershipAR - NUSS/p_Staff Meal Allowance'))

