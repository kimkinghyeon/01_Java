package labpack.Lab5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;

import static java.lang.Math.random;

public class AppTest {

    public void test1() {

        // Runnable
        Runnable now = () -> {

            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        now.run();
        // Consumer
        Consumer<LocalTime> now2 = (time) -> {
            System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        now2.accept(LocalTime.now());

        // BiConsumer
        BiConsumer<String, LocalTime> biConsumer = (str, time) ->
                System.out.println(str + " 이(가) " + time + " 에 출력됨");
        biConsumer.accept("시간은 워치 시간은 워치", LocalTime.now());

        // LocalTime.new() 는 OS에 보이는 현재 시간을 변환해주는 기능
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        // 매개변수도 필요없음
        // 리턴도 필요없음
    }

    public void test2() {

        /* Set 특징 : 중복저장이 허용되지 않음
         * TreeSet 특징 : 자동정렬
         * 컬렉션 -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 객체 -> Integer 를 사용한이유*/
        Set<Integer> lotto = new TreeSet<>();

//        int num = ((int)(Math.random()*45) +1);
//        System.out.println(num);

        while (lotto.size() < 6) {
            lotto.add((int) (random() * 45) + 1);
        }
        System.out.println(lotto);

        System.out.println("========== =========");

        Supplier<Set<Integer>> lotto2 = () -> {

            Set<Integer> set = new TreeSet<>();

            while (set.size() < 6) {
                set.add((int) (random() * 45) + 1);
            }
            return set;
        };
        Set<Integer> lottoResult = lotto2.get();
        System.out.println(lottoResult);


//        ObjIntConsumer<java.util.Random> objIntConsumer =
//                (random, value) ->
//                {
//                    for (int i = 0; i < 6; i++) {
//
//                        System.out.println("번호 : " + random.nextInt(value));
//
//                    }
//                };
//        objIntConsumer.accept(new java.util.Random(), 45);

        IntStream intStream = new Random().ints(1, 46).distinct();
        intStream.limit(6)
                .sorted()
                .forEach(System.out::println);

    }

    public void test3() {

//        double n = 3000;
//        double s = n / 1300;
//        System.out.println((int) n + " 원 " + " 달러 = " + s);
//    }
        Consumer<Integer> calc = won -> {
            double rate = 1350;
            double dollar = won / rate;
            System.out.println("원 " + won + " = 달러 " + dollar);
        };
        calc.accept(3000);
    }


    void test4() {

        Function<Integer, Double> calc2 = won -> {
            double rate = 1350;
            return won / rate;
        };

        double dollar2 = calc2.apply(3000);
        System.out.println("달러 = " + dollar2);


        BiFunction<Integer,Double,Double> calc = (won, rate) -> {

            return won / rate;

        };
        double dollar = calc.apply(3000, 1350.0);
        System.out.println("달러 = " + dollar);

    }

    void test5() {

        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("");
        strList1.add("대한제국");
        strList1.add("   ");


        // Arrays.asList() : 나열된 값을 리스트로 만들어줌
        // asList() 로 만든 리스트의 경우. 컬렉션 프레임워크가 아닌 Arrays 클래스 내부의
        List<String> strList2 = new ArrayList<>(Arrays.asList("abc","","대한제국","   "));
        List<String> strList3 = Arrays.asList("1","2");

        // static inner class 로 만들어진다. -> 추가,삭제 불가능 (변경만가능)

//        strList3.add("3");
//        strList3.clear();

        // List.of() : 팩토리메소드, 나열된 값을 리스트로 만들어준다.
        // List.of() 로 만든 리스트는 ImmutableCollections 객체의 내부 클래스인 ListN 클래스로 list 생성
        // List.of() 로 -> 추가,삭제 불가능 (변경만가능)

//        List<String> stringListTest = List.of("1", "2");
//        stringListTest.add("3");
//        stringListTest.clear();

        // new ArrayList
        List<String> stringListTest = new ArrayList<>(List.of("1", "2"));
        stringListTest.add("3");
        stringListTest.clear();
        /* List.of(), Arrays.asList() -> 추가,삭제가 불가능한 이유
        * 불변객체이어야 다른 컬렉션으로 변환이 용이 */



        List<String> strList = Arrays.asList("abc", "", "대한민국", "  ");
        Predicate<String> slist = str -> str.trim().isEmpty();

        for (String str : strList) {
            System.out.println("문자열 공백 임? : " + slist.test(str));
        }

        for (String str : strList) {

            Boolean isLengthZero = str.trim().length() == 0;

            System.out.println(isLengthZero);
        }

    }
}



