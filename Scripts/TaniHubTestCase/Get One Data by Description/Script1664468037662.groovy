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

response = WS.sendRequest(findTestObject('API/API with out parameter', [('description') : description]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].id', '4e09b023-f650-4747-9ab9-eacf14540cfb')

WS.verifyElementPropertyValue(response, '[0].name', 'Air Destroyer Goliath')

WS.verifyElementPropertyValue(response, '[0].description', 'A military airship utilized by the government to access Laputa')

WS.verifyElementPropertyValue(response, '[0].vehicle_class', 'Airship')

WS.verifyElementPropertyValue(response, '[0].length', '1,000')

WS.verifyElementPropertyValue(response, '[0].pilot', 'https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583')

WS.verifyElementPropertyValue(response, '[0].films', '[https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe]')





