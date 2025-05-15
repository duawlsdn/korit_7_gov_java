package loop;

import java.util.*;

class StudentName {
    private String name;

    public StudentName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentName{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Main7 {
    public static void main(String[] args) {
        // Student 객체들을 전부 StudentName 객체들로 변환하여 리스트를 출력
        List<StudentName> studentNames = new ArrayList<>();
        List<StudentName> studentNames2 = null;
        List<Student> students = List.of(
                new Student("김준일",80),
                new Student("김준이",94),
                new Student("김준삼",75),
                new Student("김준사",99),
                new Student("김준오",85));

//        for(int i = 0; i < students.size(); i++) {
//            studentNames.add(new StudentName(students.get(i).getName()));
//        }
        for(Student student : students) {
            if(student.getScore() > 84) {   // 추가 조건 점수가 85점 이상인 사람만
                studentNames.add(new StudentName(student.getName()));
            }
        }
        System.out.println(studentNames);   // toString() 정의!

        // 위 과정을 Stream 으로 작성
        studentNames2 = students.stream()
                .peek(student -> System.out.println(student))   // .peek() 반환 타입이 stream 이기 때문에 반복 사용 가능
                .filter(student -> student.getScore() > 84)
                .peek(student -> System.out.println(student))   // 코드 중간 중간 확인하는 차원으로 주로 사용
                .map(student -> new StudentName(student.getName()))
                .peek(studentName -> System.out.println(studentName))
                .toList();
        System.out.println(studentNames2);
    }
}
