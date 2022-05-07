import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в шифровщик/дешифровщик текста!!!");
        System.out.println("Введите 1 для шифрования текста");
        System.out.println("Введите 2 для дешифровки текста");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case (1):
                System.out.println("Введите путь к файлу, который нужно зашифровать");
                String path = scanner.nextLine();
                System.out.println("Введите ключ, с которым хотите зашифровать текст");
                int key = scanner.nextByte();
                main.encode(path, key);

            case(2):
                System.out.println("Введите путь к файлу, который нужно зашифровать");
                String path2 = scanner.nextLine();
                System.out.println("Введите ключ, с которым хотите зашифровать текст");
                int key2 = scanner.nextByte();
                main.decode(path2, key2);
    }

}
