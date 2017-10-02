import java.util.Scanner;

public class HW3 {
    //date:20161002
    //name:劉韋祥
    //ID:106021218
    //purpose:判斷大小寫或其他字元
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        if (ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println("uppercase");
        } else {
            if (ch - 'a' >= 0 && ch - 'a' < 26) {
                System.out.println("lowercase");
            } else {
                System.out.println("special character");
            }
        }
    }
}

