import java.util.Arrays;

public class encodeDecode {
    public static final char[] alphaBet = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
            'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', 'а', 'б', 'в', 'г', 'д', 'е', 'ё',
            'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э',
            'ю', 'я', '.', ',', ':', '-', '!', '?', ' '};

    public static String encode(StringBuilder message, int key) {
        char[] text = message.toString().toCharArray();
        char[] result = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < alphaBet.length; j++) {
                if (text[i] == alphaBet[j]) {
                    result[i] = alphaBet[(alphaBet.length + j + key) % alphaBet.length];

                }
            }
        }
        return String.valueOf(result);
    }


    public static String decode(StringBuilder message, int key) {
        char[] text = message.toString().toCharArray();
        char[] result = new char[text.length];
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < alphaBet.length; j++) {
                if (text[i] == alphaBet[j]) {
                    result[i] = alphaBet[(alphaBet.length + j - key) % alphaBet.length];
                }
            }
        }
        return String.valueOf(result);
    }
}
