package labpack.Lab1.mmk1;

public class appli {
    public static void main(String[] args) {
        dog dog1 = new dog();
        dog1.setName("댕댕이");
        dog1.setAge(7);
        dog1.setJong("시고르자브");

        System.out.println(dog1.getDog());

        dog dog2 = new dog();
        dog2.setName("부케팔로스");
        dog2.setAge(39);
        dog2.setJong("조랑개");

        System.out.println(dog2.getDog());

    }
}
