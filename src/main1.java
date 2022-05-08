import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в шифровщик/дешифровщик текста!!!");
        System.out.println("Введите 1 для шифрования текста");
        System.out.println("Введите 2 для дешифровки текста");
        System.out.println("Введите 3 для завершения приложения");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case (1): {
            }

            case (2): {
            }
            case(3): {
                break;
            }
        }
    }
}
