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

WebUI.click(findTestObject('Object Repository/Page_Dashboard - NUSS/div_Budget'))

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/a_Import Budget'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Import your budget'), 'Import your budget')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/span_Step 1.Download our budget template file'), 
    'Step 1.Download our budget template file')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h4_Start by downloading our budget excel te_bc870a'), 
    'Start by downloading our budget excel template file.This file has the corect column headings System needs to import your budget data.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/span_Step 2.Copy your budget into the template'), 
    'Step 2.Copy your budget into the template')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/span_Step 3.Import the updated template file'), 
    'Step 3.Import the updated template file')

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Transfer'))

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/a_New Budget Transfer'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Create Budget Transfer'), 'Create Budget Transfer')

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Budget Summary Report'), 'Budget Summary Report')

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Budget Balance Detail Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Budget Logged Data Report'), 'Budget Logged Data Report')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Budget Balance Account Group Report'), 
    'Budget Balance Account Group Report')

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Budget Balance Detail Report'), 'Budget Balance Detail Report')

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Budget Logged Data Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Budget Logged Data Report'), 'Budget Logged Data Report')

WebUI.click(findTestObject('Object Repository/Page_BudgetCost - NUSS/p_Budget Balance Account Group Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_BudgetCost - NUSS/h2_Budget Balance Account Group Report'), 
    'Budget Balance Account Group Report')

