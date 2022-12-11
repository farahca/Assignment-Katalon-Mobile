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

Mobile.waitForElementPresent(findTestObject('Object Repository/check out-Menu/android.widget.TextView - Shopping Cart'), 
    0)

Mobile.verifyElementExist(findTestObject('check out-Menu/android.widget.TextView - Shopping Cart'), 0)

Mobile.tap(findTestObject('Object Repository/check out-Menu/android.widget.Button - CHECKOUT'), 0)

Mobile.setText(findTestObject('Object Repository/check out-Menu/android.widget.EditText - Your Name (1)'), 'Farah Camilla', 
    0)

Mobile.setText(findTestObject('Object Repository/check out-Menu/android.widget.EditText - your.emailgmail.com'), 'farah@mailsac.com', 
    0)

Mobile.setText(findTestObject('Object Repository/check out-Menu/android.widget.EditText - 628123456789'), '628345678912', 
    0)

Mobile.setText(findTestObject('check out-Menu/android.widget.EditText - Your Address'), 'Jalan Pramuka II', 0)

Mobile.tap(findTestObject('check out-Menu/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('check out-Menu/android.widget.CheckedTextView - FedEx'), 0)

Mobile.setText(findTestObject('Object Repository/check out-Menu/android.widget.EditText - Comment'), 'Antar ke rumah', 0)

Mobile.tap(findTestObject('Object Repository/check out-Menu/android.widget.Button - PROCESS CHECKOUT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/check out-Menu/android.widget.TextView - Process Checkout'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/check out-Menu/android.widget.TextView - Are you sure want to checkout'), 
    0)

Mobile.tap(findTestObject('Object Repository/check out-Menu/android.widget.Button - YES'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/check out-Menu/android.widget.TextView - Congratulation'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/check out-Menu/android.widget.TextView - Thank you for ordering, your order will be review soon, invoice detail will be sent to your email when the order is ready'), 
    0)

Mobile.tap(findTestObject('check out-Menu/android.widget.Button - OK'), 0)

Mobile.closeApplication()

