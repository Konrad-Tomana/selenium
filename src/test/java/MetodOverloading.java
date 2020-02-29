import org.testng.annotations.Test;

public class MetodOverloading {

    @Test
    public void metodOverloadingTest (){
        Select autoSelect = new Select();

        autoSelect.selectBy(1);
        autoSelect.selectBy("Volvo");
    }
}
