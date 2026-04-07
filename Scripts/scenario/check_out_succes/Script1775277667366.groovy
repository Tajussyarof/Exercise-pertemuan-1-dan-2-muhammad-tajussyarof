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

WebUI.callTestCase(findTestCase('blocks/reuseable_tc/open_web'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('blocks/positive_tc/TC002_login_succes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('blocks/positive_tc/TC003_view_product_succes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('blocks/positive_tc/TC004_add to basket_succes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('blocks/positive_tc/TC005_view basket_succes'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('blocks/positive_tc/TC006_check_out_succes'), [:], FailureHandling.STOP_ON_FAILURE)

