package access.b;

import access.a.AccessData;

public class AccessOutherMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지 default 호출 불가능
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 호출 불가
//        data.privateField = 3;

        data.innerAccess();
    }
}