import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String pass = scanner.nextLine();
        //int code = scanner.nextInt();
        if(login.equals("admin") && pass.equals("123")){
            System.out.println("Доступ разрешен для ADMIN!");
        }else if(login.equals("user") && pass.equals("321")){
            System.out.println("Доступ разрешен для USER!");
        }else{
            System.out.println("Доступ запрещен!");
        }
    }
}