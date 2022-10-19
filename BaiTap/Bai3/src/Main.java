import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            InputStreamReader isr = new InputStreamReader(url.openStream());
            Scanner sc = new Scanner(isr);
            sc.useDelimiter("\\Z");
            String content = sc.next();
            content = content.replaceAll("\\n+", "");
            content = content.replaceAll("\\Gqout[\\;]?+", "");
            content = content.replaceAll("\\<\\/a\\>", "");
            Pattern p = Pattern.compile("body container\">(.*)</h3>");
            Matcher math = p.matcher(content);

            while (math.find()){
                String str = math.group(1);
                str = str.replaceAll("&quat\\;","");
                String[] arrStr = str.split("htm\">");
                System.out.println(arrStr[1]);

                System.out.println(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}