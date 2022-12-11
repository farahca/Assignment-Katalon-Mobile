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

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.TextView - Menu Category'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Add to card-Menu/android.widget.TextView - Category'), 0)

Mobile.verifyElementExist(findTestObject('Add to card-Menu/android.widget.TextView - Category'), 0)

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.TextView - Fashions'), 0)

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.ImageView Bracelet'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Add to card-Menu/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.Button - ADD TO CART'), 0)

Mobile.setText(findTestObject('Object Repository/Add to card-Menu/android.widget.EditText'), '2', 0)

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.Button - ADD'), 0)

Mobile.tap(findTestObject('Object Repository/Add to card-Menu/android.widget.Button - CART'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Add to card-Menu/android.widget.TextView - Gold Titanium Diamond Womens Bracelet (1)'), 
    0)

