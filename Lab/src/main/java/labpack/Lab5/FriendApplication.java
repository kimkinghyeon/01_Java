package labpack.Lab5;

import java.util.List;
import java.util.Map;

public class FriendApplication {
    public static void main(String[] args) {

        // 1. 다음 리스트를 순회하면서 40세 이상만 출력하세요. (list 의 forEach 메소드 사용할 것.)

        List<Friend> list = List.of(
                new Friend("홍길동", 30),
                new Friend("신사임당", 48),
                new Friend("전봉준", 35),
                new Friend("세종대왕", 54),
                new Friend("간달프", 105)
        );

        /* foEach()
         * 컬렉션에 들어있는 기능으로, Iterator 를 이용해 구현
         * 목록의 요소를 반복하고, 특정 작업을 수행하는 간결한 방법 */

        list.forEach(friend -> {
            if (friend.getAge() >= 40) {
                System.out.println(friend);
            }
        });

        System.out.println("========== ========== ==========");

        // 2. 다음 map에서 key값이 홀수인 value만 출력하세요. (map 의 forEach 메소드 사용할 것.)

        Map<Integer, Friend> map = Map.of(
                1, new Friend("홍길동", 30),
                2, new Friend("신사임당", 48),
                3, new Friend("전봉준", 35),
                4, new Friend("세종대왕", 54),
                5, new Friend("간달프", 105)
        );

        map.forEach((k, v) -> {
            if (k % 2 != 0) {
                System.out.println(v);
            }
        });

    }

}


