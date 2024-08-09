package springboot.com.techcareer.week4.Sunday.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> stringList = Arrays.asList(List.of("test1", "test2"), List.of("test", "test4"));
        /**
         *       {   {"test1", "test2"},    {"test", "test4"}   }
         *       {  "test1", "test2", "test3", "test4"  }
         */
    }

    public static List<String> convertList(List<List<String>> stringList) {
        List<String> newList = new ArrayList<>();
        for (List<String> strings : stringList) {
            for (String string : strings) {
                newList.add(string);
            }
        }
        return newList;
    }

    public static List<String> convertListStream(List<List<String>> stringList) {
        return stringList.stream()
                .flatMap(Collection::stream) //stream<String>
                .toList();
    }
}
