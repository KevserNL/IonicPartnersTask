package com.IonicPartnersTask.pages;

import com.IonicPartnersTask.utilities.BrowserUtils;
import com.IonicPartnersTask.utilities.Driver;
import org.openqa.selenium.By;

public class BlogPage {

    public void menuBar(String baseMenu){
        String dynamicLocator = "//a[.='"+baseMenu+"']";
       BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath(dynamicLocator)));
    }
}
