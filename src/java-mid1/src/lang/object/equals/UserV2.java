package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // Object 클래스 내에 equals 상속 받음.
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return this.id.equals(user.id);
//    }

    // 정확한 equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}

