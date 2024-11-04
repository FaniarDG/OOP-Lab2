import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p1 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[_a-zA-Z0-9]{8,}");
        while (true)
        {
            System.out.println("Введите пароль:");
            String password = sc.nextLine();
            Matcher m1 = p1.matcher(password);
            System.out.println((m1.matches())?("Пароль гуд"):("Пароль не гуд"));
        }
    }
}