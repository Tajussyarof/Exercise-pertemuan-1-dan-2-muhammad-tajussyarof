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

WebUI.click(findTestObject('Object Repository/page_checkout/btn_Proceed to Checkout'))

WebUI.waitForElementVisible(findTestObject('Object Repository/page_checkout/txt_Billing Details'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/page_checkout/txt_Billing Details'))

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_first_name'), 'saya')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_last_name'), 'test')

WebUI.setText(findTestObject('page_checkout/textarea_Order Notes_order_comments'), 'testing')

WebUI.setText(findTestObject('Object Repository/page_checkout/input_Company Name_billing_company'), 'coba')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_phone'), '08123456789')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_address_1'), 'jalan sesama')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_address_2'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_city'), 'jakarta barat')

WebUI.setText(findTestObject('Object Repository/page_checkout/input__billing_postcode'), '')

WebUI.click(findTestObject('Object Repository/page_checkout/label_Cash on Delivery'))

WebUI.click(findTestObject('Object Repository/page_checkout/input_PayPal Express Checkout_place_order'))

WebUI.waitForElementVisible(findTestObject('page_checkout/txt_Billing Postcode ZIP is a required field'), 0)

WebUI.verifyElementVisible(findTestObject('page_checkout/txt_Billing Postcode ZIP is a required field'))

