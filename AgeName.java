import java.util.*;

public class AgeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("My Age is:" + age);
        System.out.println("My Name is:" + name);
    }
}
