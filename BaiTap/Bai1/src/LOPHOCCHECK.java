import java.util.Scanner;

public class LOPHOCCHECK {
    private static bai1 bai1;
    public static final String[] validEmail = new String[]{


//            "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"

            "C0318G"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap lop hoc vao day: ");
        sc.nextLine();
        bai1 = new bai1();
        for (String lophocCheck : validEmail) {
            boolean isvalid = bai1.validate(lophocCheck);
            System.out.println("Lop hoc cua ban: " + lophocCheck + "  dinh dang  " + isvalid);        }
    }

}
