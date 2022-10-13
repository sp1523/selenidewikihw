package wiki;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class softAssertionsWiki {

    @Test
void softAssertionsGithub(){

open("https://github.com/selenide/selenide");
$("#wiki-tab").click();
$(".js-wiki-more-pages-link").click();

$("#wiki-pages-box").shouldHave(text("SoftAssertions")).$(linkText("SoftAssertions")).click();

$(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
$("#user-content-3-using-junit5-extend-test-class").ancestor("h4").sibling(0).shouldHave(text("SoftAssertsExtension.class"));
$("#user-content-3-using-junit5-extend-test-class").ancestor("h4").sibling(2).shouldHave(text("SoftAssertsExtension softAsserts = new"));



    }
}
