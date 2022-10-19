import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap ten lop hoc vao day: ");
        String tenLop = sc.nextLine();
        Pattern pattern = Pattern.compile("^[APC]\\d{4,}[GHIKLM]$");
        Matcher matcher = pattern.matcher(tenLop);
        boolean checkTenLop = matcher.matches();
        if(checkTenLop){
            System.out.println("Ten cua ban hop le:");
        }else{
            System.out.println("Ten cua ban sai dinh dang ");
        }
    }
}