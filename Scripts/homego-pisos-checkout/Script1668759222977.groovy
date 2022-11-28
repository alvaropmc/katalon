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

WebUI.openBrowser('https://yoigo-alarms-frontend.dev.k8s.masmovil.com/')

WebUI.click(findTestObject('Object Repository/Page_Alarmas en Espaa - HomeGO de Yoigo/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Page_Alarmas en Espaa - HomeGO de Yoigo/a_Ms info'))

WebUI.click(findTestObject('Object Repository/Page_Alarma para pisos Desde 29,90mes  Yoigo/button_No soy clienteAn no eres cliente Yoigo'))

WebUI.click(findTestObject('Object Repository/Page_Alarma para pisos Desde 29,90mes  Yoigo/a_Lo quiero'))

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_An no eres cliente Yoigo_name'), 'testpnc')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Nombre y apellidos_phone'), '689209341')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Tu mvil Yoigo_email'), 'testpnc@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_HomeGO/input_Tu e-mail_legal'))

WebUI.click(findTestObject('Object Repository/Page_HomeGO/button_Confirmar'))

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Tipo de documento_docNumber'), '90160253T')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Nombre de la empresa_postalCode'), '28050')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Cdigo postal_province'), 'madrid')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Provincia_city'), 'madrid')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Localidad_type'), 'Calle')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_An no eres cliente Yoigo_name'), 'Pintor antonio Saura')

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Nombre de la va_number'), '14')

WebUI.scrollToElement(findTestObject('Page_HomeGO/input_Nombre de la va_number'), 0)

WebUI.click(findTestObject('Object Repository/Page_HomeGO/button_Continuar'))

WebUI.setText(findTestObject('Object Repository/Page_HomeGO/input_Datos de pago y confirmacin_iban'), 'ES5600495298990058356710')

WebUI.click(findTestObject('Object Repository/Page_HomeGO/input_Tu e-mail_legal'))

WebUI.click(findTestObject('Object Repository/Page_HomeGO/button_Confirmar el pedido'))

WebUI.closeBrowser()

