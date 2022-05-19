import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReaderWriter {

    public static void reader(String stringPath) {
        StringBuilder result = new StringBuilder();
        Path path = Path.of(stringPath);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter key for encrypt your message: ");
        int key = scanner.nextInt();
        try {
            List<String> list = Files.readAllLines(path);
            for (String s : list) {
                result.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(encodeDecode.encode(result, key));
    }

    public static void main(String[] args) {
        reader("C:\\Users\\vadim\\Desktop\\1.txt");

    }
}


