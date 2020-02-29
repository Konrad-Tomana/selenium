import com.google.common.io.Files;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;


public class ZapisDoPliku {

    @Test
    public void zapisDoPliku() throws IOException {

        File file = new File("src/main/resources/zapis.txt");

        BufferedWriter writer = Files.newWriter(file,Charset.defaultCharset());
        writer.write("To jest tekst do zapisania, ty chuju!");
        writer.close();
    }
}
