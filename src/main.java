import java.io.FileReader;
import java.nio.file.Path;

public class main {
    public static final char[] ALPHABET = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
            'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё',
            'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э',
            'ю', 'я', '.', ',', ':', '-', '!', '?', ' '};

    public static void main(String[] args) {
        encode("Привет", 1);
        decode("Рсйгёу", 1);

    }

    public static void encode(String message, int key) {
        char[] message1 = message.toCharArray();
        char[] result = new char[message.length()];

        for (int i = 0; i < message1.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (message1[i] == ALPHABET[j]) {
                    result[i] = ALPHABET[((ALPHABET.length) + j + key) % ALPHABET.length];
                }
            }
        }
        System.out.println(result);
    }

    public static void decode(String message, int key) {
        char[] message1 = message.toCharArray();
        char[] result = new char[message.length()];

        for (int i = 0; i < message1.length; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (message1[i] == ALPHABET[j]) {
                    result[i] = ALPHABET[((ALPHABET.length) + j - key) % ALPHABET.length];
                }
            }
        }
        System.out.println(result);
    }
}


