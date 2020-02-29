import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class CzytaniePliku {
    @Test
    public void czytaniePliku() {

        File plik = new File("src/main/resources/tekst.txt");

        try {
            BufferedReader reader = Files.newReader(plik,Charset.defaultCharset());

            String line;
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
