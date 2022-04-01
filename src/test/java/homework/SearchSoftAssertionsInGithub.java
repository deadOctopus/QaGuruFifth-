package homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSoftAssertionsInGithub {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "-10x0"; // экран был не по центру
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void searchRepo () {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $(byText("Show 2 more pages…")).scrollTo().click();
        $(byText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent().shouldHave(text(" JUnit5 extend test class:"));
        //sleep(5000);
    }
}
