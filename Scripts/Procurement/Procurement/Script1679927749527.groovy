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

WebUI.navigateToUrl(GlobalVariable.url + '/Procurement/PurchaseRequest/List')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Procurement - NUSS/button_Export'), 0)

WebUI.rightClick(findTestObject('Object Repository/Page_Procurement - NUSS/a_New Purchase Request'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Procurement - NUSS/a_New Purchase Request'), 0)

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Non Category'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Create PurchaseRequest  Non category'), 
    'Create PurchaseRequest Non category')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h3_PurchaseRequestNumber'), 'PurchaseRequestNumber：')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/span_Purchase Items'), 'Purchase Items')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/span_Other Information'), 'Other Information')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/span_Annex Information'), 'Annex Information')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Market List'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Sourcing'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Inquiry'), 'Inquiry')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Inquiry PR List'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Purchase Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Purchase Order'), 'Purchase Order')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Order PR List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Add Order PR'), 'Add Order PR')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Cancellation'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Cancel Order'), 'Cancel Order')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_PO Reminder'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Goods Receiving Note'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Goods Receiving Note'), 'Goods Receiving Note')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Incoming PO'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Return Goods'))

WebUI.rightClick(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Return Goods List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Return Goods List'), 'Return Goods List')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Supplier'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Supplier'), 'Supplier')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Authentication'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Authentication'), 'Authentication')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Classification'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Classification'), 'Classification')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Suspension'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Frozen'), 'Frozen')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Blacklisted'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Agreement'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Agreement'), 'Agreement')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Search Product'))

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Products'), 'Products')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Products Category'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Product Categories'), 'Product Categories')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Products Attribute'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Product Attributes'), 'Product Attributes')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Products AttributeValue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Product Attribute Values'), 'Product Attribute Values')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Resources'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Company'), 'Company')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Department Address'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Department Address'), 'Department Address')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Department Market List'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Department MarketList'), 'Department MarketList')

WebUI.click(findTestObject('Object Repository/Page_Procurement - NUSS/p_Department Warehouse'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Procurement - NUSS/h2_Department Warehouse'), 'Department Warehouse')

