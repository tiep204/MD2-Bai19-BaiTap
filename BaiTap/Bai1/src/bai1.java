import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai1 {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String LOPHOC = "^[APC]\\d{4,}[GHIKLM]$";
    public bai1(){
        pattern = Pattern.compile(LOPHOC);
    }
    public boolean validate(String lophoc){
        matcher = pattern.matcher(lophoc);
        return matcher.matches();
    }

}
