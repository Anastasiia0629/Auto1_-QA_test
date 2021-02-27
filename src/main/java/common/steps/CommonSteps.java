package common.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.sleep;


public class CommonSteps {

    @Step
    public static void assertEqualsWithWait(SelenideElement element, String var2, int waitSec) {
        element.shouldBe(Condition.visible);
        boolean condition = false;
        String var1 = "";
        for (int i = 0; i < (waitSec * 2); i++) {
            var1 = element.getText();
            condition = var1.equals(var2);
            if (condition) {
                break;
            } else {
                sleep(500);
            }
        }
    }
}
