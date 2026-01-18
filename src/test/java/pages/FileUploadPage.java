package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class FileUploadPage extends Form {

    private static final String Name="File Upload";

    private final By ChooseFile=By.id("file-upload");
    private final By fileSubmit=By.id("file-submit");

    private ITextBox fileNameInput= AqualityServices.getElementFactory().getTextBox(ChooseFile,"Upload");
    private ITextBox fileSubmitBtn= AqualityServices.getElementFactory().getTextBox(fileSubmit,"Submit file");

    public FileUploadPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, Name)), Name);
    }

    public void uploadFile(String fileName){
        fileNameInput.clearAndType(fileName);
    }

    public void clickSubmitBtn(){
        fileSubmitBtn.click();
    }
}
