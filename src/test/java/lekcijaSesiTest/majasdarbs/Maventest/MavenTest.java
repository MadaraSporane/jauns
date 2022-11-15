package lekcijaSesiTest.majasdarbs.Maventest;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Madara Sporane");
        System.out.println(asciiArt);

    }
}
