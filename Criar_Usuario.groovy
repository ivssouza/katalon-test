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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automacaocombatista.herokuapp.com/users/new')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Nome_username'), 'Fernando')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_ltimo nome_userlastname'), 'almeida')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Email_useremail'), 'fernando.almeida@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Endereo_useraddress'), 'Alameda São Boaventura, 458')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Universidade_useruniversity'), 'UFF')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Profisso_userprofile'), 'Estudante')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Gnero_usergender'), 'Masculino')

WebUI.setText(findTestObject('Object Repository/Page_Automao com Batista/input_Idade_userage'), '20')

WebUI.click(findTestObject('Object Repository/Page_Automao com Batista/input_Idade_commit'))

WebUI.delay(5)

WebUI.closeBrowser()

