import java.util.*;
public class demo1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp =a;
        a = b;
        b = temp;
        System.out.println("After swaping A="+a);
        System.out.println("After swaping B="+b);


    }
}
