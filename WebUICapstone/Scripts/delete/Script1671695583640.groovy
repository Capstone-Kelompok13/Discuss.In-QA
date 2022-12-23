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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://discussin.netlify.app/Login/')

WebUI.setText(findTestObject('Object Repository/deleteuser/Page_Login Page/input_Email_email'), 'admin90@gmail.com')

WebUI.click(findTestObject('Object Repository/deleteuser/Page_Login Page/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/deleteuser/Page_Login Page/input_Password_password'), 'mYZymSDYmOG4584iIPDOyYgU+CveE8Pm')

WebUI.click(findTestObject('Object Repository/deleteuser/Page_Login Page/svg_Password_MuiSvgIcon-root MuiSvgIcon-fon_7a181d'))

WebUI.setText(findTestObject('Object Repository/deleteuser/Page_Login Page/input_Password_password_1'), '12086478')

WebUI.click(findTestObject('Object Repository/deleteuser/Page_Login Page/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('deleteuser/Page_Dashboard - Home/svg_Dashboard_MuiSvgIcon-root MuiSvgIcon-fo_193553'))

WebUI.click(findTestObject('Object Repository/deleteuser/Page_Dashboard - Manage User/svg_Banned_MuiSvgIcon-root MuiSvgIcon-fontS_839143'))

WebUI.click(findTestObject('Object Repository/deleteuser/Page_Dashboard - Manage User/button_Yes'))

WebUI.closeBrowser()

