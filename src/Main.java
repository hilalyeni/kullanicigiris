import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Parolanızı Giriniz: ");
        password = input.nextLine();

        if (userName.equals("hilalyeni") && password.equals("java123")) {
            System.out.println("Giriş Yapıldı!");
        }
        else {
            System.out.println("Bilgiler Yanlış!");
        }
    }
}