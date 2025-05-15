package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("메인문 처럼 쓸 수 있음");
        };
        runnable.run();

        Supplier<Double> supplier = () -> 10.10;
        double d = supplier.get();

        Consumer<Integer> consumer = n -> {
            System.out.println("consumer 사용");
            System.out.println("전달 받은 데이터 : " + n);
        };
        consumer.accept(1000);

        List<Integer> numList = List.of(10,20,30,40);
        numList.forEach(n -> System.out.println("number -> " + n));
        // .forEach() 시 중간에 끊을 수 없기 때문에 대량의 데이터 값을 표시할 때 불필요.

        Function<String, String> fx = name -> "이름 : " + name;
        String nameText = fx.apply("Ethan");
        System.out.println(nameText);

        UnaryOperator<String> fx2 = name -> "이름 : " + name;
        nameText = fx2.apply("Ethan");
        System.out.println(nameText);

        // boolean 타입으로 true, false 를 반환하기 때문에 조건문에서 자주 사용
        String searchName = "Ethan";

        List<String> 일학년이름 = List.of("Ethan","둘1","셋1","넷1");
        List<String> 이학년이름 = List.of("하나2","둘2","셋2","넷2");

        Predicate<List<String>> isContains = list -> list.contains(searchName);
        System.out.println(isContains.test(일학년이름));
        System.out.println(isContains.test(이학년이름));

        Predicate<String> isContains2 = name -> 일학년이름.contains(name) || 이학년이름.contains(name);
        isContains2.test(searchName);

        List<String> newDataList = new ArrayList<>();
        List<String> dataList = List.of("aaa","bbb","ccc","abaa","bbaa","ccbb");
        for (String data : dataList) {
            if (data.contains("a")) newDataList.add(data);
        }
        System.out.println(newDataList);

        List<String> dataList3 = List.of("aaa","bbb","ccc","abaa","bbaa");
        List<String> rdata = new ArrayList<>(dataList3);
        rdata.removeIf(data -> !data.contains("a"));
        System.out.println(rdata);

        List<String> newDataList2 = dataList.stream()
                .filter(data -> data.contains("a"))
                .toList();

//        Stream<Integer> numStream = List.of(1,2,3,4).stream();
        /*
            스트림 구성
            첫 번째 단계 -> 스트림 생성
            두 번째 단계 -> 중간 연산(조건에 맞는 데이터 구분, 데이터 값 수정, 정렬, 중복 제거, 제한, 건너뛰기)
            세 번째 단계 -> 최종 연산(반복, 결과 수집, 갯수 조회, 매칭 여부, 검색, 합산)
            스트림의 특징 -> 반복 중 뒤로 돌아갈 수는 없다.
         */
        Stream<Integer> numStream = Stream.of(1,2,3,4);
        numStream.filter(num -> num % 2 == 0).forEach(n -> System.out.println(n));

        List<Integer> numList2 = List.of(1,2,3,4);
        for(Integer num : numList2) {
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
