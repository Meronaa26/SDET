package seleniumReview.day14_pom_synchronization;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumReview.pages.DragAndDropPage;
import seleniumReview.utilites.BrowserUtils;
import seleniumReview.utilites.Driver;

public class ActionsPractices {

    @Test
    public void drag_and_drop_test(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        DragAndDropPage dragAndDropPage=new DragAndDropPage();
        Actions actions=new Actions(Driver.getDriver());

        BrowserUtils.sleep(1);
        dragAndDropPage.acceptCookies.click();
        BrowserUtils.sleep(3);
        actions.dragAndDrop(dragAndDropPage.smallCircle,dragAndDropPage.bigCircle).perform();

        //Assert that the text in the circle changes to "You did great!"
        String expectedMessage="You did great!";
        String actualMessage= dragAndDropPage.bigCircle.getText();

        Assert.assertTrue(actualMessage.contains(expectedMessage));



    }
}
