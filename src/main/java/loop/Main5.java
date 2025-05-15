package loop;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        // 단어의 시작이 A 또는 a로 시작하는 단어를 newWords 리스트에 담아 출력하시오.

        List<String> words = List.of("Apple","banana","avocado","carrot");
        List<String> newWords = new ArrayList<>();

        // 1.
//        for(String word : words) {
//            if(word.startsWith("A") || word.startsWith("a")) {
//                newWords.add(word);
//            }
//        }

        // 2.
//        for(String word : words) {
//            char c = word.charAt(0);
//            if(c == 'A' || c == 'a') newWords.add(word);
//        }

        // 3.
        for(String word : words ) {
            String firstStr = word.substring(0, 1); // substring을 통해 출력된 값은 새로운 메모리에 할당 되기 때문에 주소값이 달라져 == 가 아닌 equals()로 사용
            if(firstStr.equalsIgnoreCase("a")) {    // .equalsIgnoreCase() 대 소문자 구분 없이 비교 가능 메서드
                newWords.add(word);
            }
        }

        System.out.println(newWords);
    }
}
