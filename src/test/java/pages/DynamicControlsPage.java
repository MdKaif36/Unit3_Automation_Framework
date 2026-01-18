package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class DynamicControlsPage extends Form {

    private static final String NAME = "Dynamic Controls";

    private IElementFactory elementFactory= AqualityServices.getElementFactory();

    private final By Enable= By.xpath("//*[text()='Enable']");

    private final By Input= By.xpath("//*[@id='input-example']//input");

    private IButton Enablebtn= elementFactory.getButton(Enable,"Status Enable");
    private ITextBox textField= elementFactory.getTextBox(Input,"Input field");


    public DynamicControlsPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,NAME)), NAME);
    }

    public void clickEnable(){
        Enablebtn.click();
    }

    public boolean isInputEnabled(){
        return textField.state().waitForEnabled();

    }

    public void inputText(String text){
        textField.clearAndType(text);
    }

    public String getInputTextValue(){
        return textField.getValue();
    }
}
