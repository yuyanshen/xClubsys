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

WebUI.navigateToUrl(GlobalVariable.url + '/Inventory/Pickings/StockMoves')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inventory - NUSS/h2_Stock Movement'), 'Stock Movement')

WebUI.verifyElementText(findTestObject('Page_Inventory - NUSS/md-tab-item_All'), 'ALL')

WebUI.verifyElementText(findTestObject('Page_Inventory - NUSS/md-tab-item_Done'), 'DONE')

WebUI.verifyElementText(findTestObject('Page_Inventory - NUSS/md-tab-item_Transferring'), 'TRANSFERRING')

WebUI.verifyElementText(findTestObject('Page_Inventory - NUSS/md-tab-item_Draft'), 'DRAFT')

WebUI.verifyElementText(findTestObject('Page_Inventory - NUSS/md-tab-item_Cancelled'), 'CANCELLED')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inventory - NUSS/span_PickingNo'), 'PickingNo')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inventory - NUSS/span_Transaction Type'), 'Transaction Type')

