import java.util.Scanner;

public class HW2{
    //date:20161002
    //name:劉韋祥
    //ID:106021218
    //purpose:及不及格
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt() ;
        if (v1 >= 60) {
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}

