import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien thoai cua ban vao day: ");
        String dienthoai = sc.nextLine();
        Pattern pattern = Pattern.compile("^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$");
        Matcher matcher = pattern.matcher(dienthoai);
        boolean checksdt = matcher.matches();
        if(checksdt){
            System.out.println("so dien thoai cua bạn: "+dienthoai + " la so dien thoai hop le");

        }else{
            System.out.println("ko hop le");
        }
    }
}