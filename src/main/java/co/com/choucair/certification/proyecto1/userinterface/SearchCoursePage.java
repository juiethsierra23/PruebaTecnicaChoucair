package co.com.choucair.certification.proyecto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("select university").located(By.xpath("//div[@id='universidad'] //strong"));
    public static final Target INPUT_COURSE = Target.the("course finder").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("press to search the course").located(By.id("//button[class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("press to search the course").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extract course name").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}
