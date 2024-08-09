package springboot.com.techcareer.week4.Sunday.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCase {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Merhaba", "hello", "HOla");
        //System.out.println(mapUpperCase(stringList));
        System.out.println(mapUpperCaseStream(stringList));
    }

    public static List<String> mapUpperCase(List<String> words) {
        List<String> upperCasedWords = new ArrayList<>();
        for (String word : words) {
            upperCasedWords.add(word.toUpperCase());
        }
        return upperCasedWords;
    }

    public static List<String> mapUpperCaseStream(List<String> words) {

        // Listenin elemanlarını dön
        // String'in toUpperCase metoduna sok
        // Listeye ata

        return words.stream()
                .map(String::toUpperCase)
                .toList();
    }
}
