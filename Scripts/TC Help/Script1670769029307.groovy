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


Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Help'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Help (1)'), 0)

Mobile.verifyElementExist(findTestObject('Help-Menu/android.widget.TextView - Help (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - How to order'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.widget.TextView - How To Shop At Solomerce Apps'), 
    0)

Mobile.verifyElementExist(findTestObject('Help-Menu/android.widget.TextView - How To Shop At Solomerce Apps'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.Button Back'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Payment'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Payment (1)'), 0)

Mobile.verifyElementExist(findTestObject('Help-Menu/android.widget.TextView - Payment (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - PayPal'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - BANK BCA'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - BANK MANDIRI'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - BANK BRI'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - BANK BNI'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Please note'), 0)

Mobile.tap(findTestObject('Help-Menu/android.widget.Button Back'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Shipping'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Shipping (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.widget.TextView - For shipping, we use a number of shipping services (couriers) JNE, TIKI, and Pos Indonesia'), 
    0)

Mobile.tap(findTestObject('Help-Menu/android.widget.Button Back'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Profile'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Profile (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.webkit.WebView'), 0)

Mobile.verifyElementExist(findTestObject('Help-Menu/android.webkit.WebView'), 0)

Mobile.tap(findTestObject('Help-Menu/android.widget.Button Back'), 0)

Mobile.tap(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Contact us'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Contact us (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Help-Menu/android.widget.TextView - Do you still feel confused by the system that you need Do not worry, please contact us now Gladly we will help resolve your needs'), 
    0)

Mobile.verifyElementExist(findTestObject('Help-Menu/android.widget.TextView - Do you still feel confused by the system that you need Do not worry, please contact us now Gladly we will help resolve your needs'), 
    0)

Mobile.tap(findTestObject('Help-Menu/android.widget.Button Back'), 0)

