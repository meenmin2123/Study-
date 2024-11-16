package access.a;

public class PublicClass {
    public static void main(String[] args) {

        // 자기 자신의 클래스
        PublicClass publicClass = new PublicClass();

        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();

    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
