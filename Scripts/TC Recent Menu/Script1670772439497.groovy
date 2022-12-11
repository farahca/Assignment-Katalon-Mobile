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

def apkPath = System.getProperty('user.dir') + GlobalVariable.url

Mobile.startApplication(apkPath, true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - E-Commerce Android App'), 
    0)

Mobile.tap(findTestObject('Object Repository/Recent- Menu/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Recent- Menu/android.widget.ImageView (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - Samsung Galaxy S10 - Black'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - 899 USD'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('Object Repository/Recent- Menu/android.widget.ImageButton Back'), 0)

Mobile.tap(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML'), 
    0)

Mobile.waitForElementPresent(findTestObject('Recent- Menu/android.widget.TextView - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML (1)'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - 20 USD'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - 10 item(s)'), 0)

Mobile.tap(findTestObject('Recent- Menu/android.widget.ImageButton Back'), 0)

Mobile.tap(findTestObject('Recent- Menu/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 0)

Mobile.waitForElementPresent(findTestObject('Recent- Menu/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - Apple watch series 3 GPS 42mm Black'), 
    0)

Mobile.verifyElementExist(findTestObject('Object Repository/Recent- Menu/android.widget.TextView - 400 USD (1)'), 0)

Mobile.verifyElementExist(findTestObject('Recent- Menu/android.widget.TextView - 5 item(s)'), 0)

Mobile.tap(findTestObject('Recent- Menu/android.widget.ImageButton Back'), 0)

