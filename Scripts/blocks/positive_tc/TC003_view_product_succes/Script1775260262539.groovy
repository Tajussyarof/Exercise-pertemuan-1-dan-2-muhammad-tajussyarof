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

WebUI.click(findTestObject('Object Repository/page_viewproduct/btn_Shop'))

WebUI.click(findTestObject('page_viewproduct/btn_Android'))

WebUI.waitForElementVisible(findTestObject('page_viewproduct/txt_Android Quick Start Guide'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Android Quick Start Guide'))

WebUI.click(findTestObject('Object Repository/page_viewproduct/btn_HTML'))

WebUI.waitForElementVisible(findTestObject('page_viewproduct/txt_HTML5 Forms'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_viewproduct/txt_HTML5 Forms'))

WebUI.click(findTestObject('Object Repository/page_viewproduct/btn_JavaScript'))

WebUI.waitForElementVisible(findTestObject('page_viewproduct/txt_Functional Programming in JS'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Functional Programming in JS'))

WebUI.click(findTestObject('Object Repository/page_viewproduct/btn_selenium'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Selenium Ruby'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Selenium Ruby'))

WebUI.click(findTestObject('Object Repository/page_viewproduct/txt_Selenium Ruby'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Product Description'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_viewproduct/txt_Product Description'))

