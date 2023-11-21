package _08.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("마음");
        Person q = new PersonFrom("소리", "서울");

        // System.out.println (p.sameName (q));
        // 오류 안 남

        // Person x = q; System.out.println (x.getName ());
        // 오류 안 남

        // PersonFrom x = p; System.out.println(x.getCity());
        // 오류: Person 타입 변수에 PersonFrom 타입의 객체를 할당하려 했기 때문

        // Person x = q; System.out.println(x.getCity());
        // 오류: Person 클래스에는 getCity 메서드가 없음

        // System.out.println(q.same(p));
        // 오류: same 메서드는 PersonFrom 클래스에서 정의됨
    }
}
