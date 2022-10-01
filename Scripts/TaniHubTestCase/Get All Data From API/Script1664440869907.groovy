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

response = WS.sendRequest(findTestObject('API/API with out parameter'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].id', '4e09b023-f650-4747-9ab9-eacf14540cfb')

WS.verifyElementPropertyValue(response, '[1].id', 'd8f893b5-1dd9-41a1-9918-0099c1aa2de8')

WS.verifyElementPropertyValue(response, '[2].id', '923d70c9-8f15-4972-ad53-0128b261d628')

WS.verifyElementPropertyValue(response, '[0].name', 'Air Destroyer Goliath')

WS.verifyElementPropertyValue(response, '[1].name', 'Red Wing')

WS.verifyElementPropertyValue(response, '[2].name', 'Sosuke\'s Boat')

WS.verifyElementPropertyValue(response, '[0].description', 'A military airship utilized by the government to access Laputa')

WS.verifyElementPropertyValue(response, '[1].description', 'An experimental aircraft captured by Porco. Named Savoia S.21')

WS.verifyElementPropertyValue(response, '[2].description', 'A toy boat where Sosuke plays')

WS.verifyElementPropertyValue(response, '[0].vehicle_class', 'Airship')

WS.verifyElementPropertyValue(response, '[1].vehicle_class', 'Airplane')

WS.verifyElementPropertyValue(response, '[2].vehicle_class', 'Boat')

WS.verifyElementPropertyValue(response, '[0].length', '1,000')

WS.verifyElementPropertyValue(response, '[1].length', '20')

WS.verifyElementPropertyValue(response, '[2].length', '10')

WS.verifyElementPropertyValue(response, '[0].pilot', 'https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583')

WS.verifyElementPropertyValue(response, '[1].pilot', 'https://ghibliapi.herokuapp.com/people/6523068d-f5a9-4150-bf5b-76abe6fb42c3')

WS.verifyElementPropertyValue(response, '[2].pilot', 'https://ghibliapi.herokuapp.com/people/a10f64f3-e0b6-4a94-bf30-87ad8bc51607')

WS.verifyElementPropertyValue(response, '[0].films', '[https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe]')

WS.verifyElementPropertyValue(response, '[1].films', '[https://ghibliapi.herokuapp.com/films/ebbb6b7c-945c-41ee-a792-de0e43191bd8]')

WS.verifyElementPropertyValue(response, '[2].films', '[https://ghibliapi.herokuapp.com/films/758bf02e-3122-46e0-884e-67cf83df1786]')




