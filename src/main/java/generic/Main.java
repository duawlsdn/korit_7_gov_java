package generic;

public class Main {
    /*
        와일드카드(?)의 제약 조건
        1. ? extends 클래스자료형  -> 해당 클래스의 자료형의 자식 클래스자료형만 허용
        2. ? super 클래스자료형    -> 해당 클래스의 자료형의 부모 클래스자료형만 허용
     */

    public static void showAll(Repository<? extends Student> repository){
        repository.findAll().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Repository<HighStudent> hsRepo = new Repository<>();
        Repository<AcademyStudent> asRepo = new Repository<>();

        hsRepo.save(new HighStudent());
        asRepo.save(new AcademyStudent());

        showAll(hsRepo);

    }
}
