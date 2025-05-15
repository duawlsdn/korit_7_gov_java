package loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        // 중복된 단어를 제거하고 출력
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");
//        Set<String> set = new HashSet<>();
//        set.addAll(words);
//        System.out.println(set);

        List<String> nw = new ArrayList<>();
        for(String word : words) {
            if(nw.contains(word)) continue;
            nw.add(word);
        }
        System.out.println(nw);


    }
}
