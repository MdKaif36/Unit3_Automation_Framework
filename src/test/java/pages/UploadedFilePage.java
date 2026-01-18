package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import org.openqa.selenium.By;

public class UploadedFilePage extends Form {

    private static final String Name= "File Uploaded";

    private final By uploadedFile=By.id("uploaded-files");

    private ILabel uploadedFileLbl= AqualityServices.getElementFactory().getLabel(uploadedFile,"File name");

    public UploadedFilePage(){
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH,Name)),Name);
    }

    public String getUploadedFileName(){
        return uploadedFileLbl.getText();
    }
}
