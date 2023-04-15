package support;

import org.openqa.selenium.By;
import runner.RunCucumber;

import java.util.Random;

public class Utils extends RunCucumber {

    public static By generateLink(){

        String id_init = "item_";
        String id_final = "_title_link";

        Random random = new Random();
        int min = 0;
        int max = 5;
        int result = random.nextInt(max-min) + min;

        return By.id(id_init + result + id_final);
    }

}
