package labpack.Lab3;

public class Application {
    public static void main(String[] args) {
        Max max = new Max();
        max.setname("max");
        max.setAge(5);
        max.setJong("골든리트리버");
        System.out.println("Max");
        System.out.println(max.getMax());

        James james = new James();
        james.setName("james");
        james.setAge(30);
        james.setMery("결혼함");
        james.setSon(3);
        System.out.println("james");
        System.out.println(james.getJames());

        Tesla_Model_S tesla_model_s = new Tesla_Model_S();
        tesla_model_s.setModel("s");
        tesla_model_s.setChur(2022);
        tesla_model_s.setZungi("전기차");
        System.out.println("Tesla_S");
        System.out.println(tesla_model_s.getTesla());

        Joshua_Bloch joshua_bloch = new Joshua_Bloch();
        joshua_bloch.Book();

    }

}
