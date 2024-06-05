package labpack.Lab3;

public class Max {
    //이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고,
    // 객체를 생성하여 값을 출력하세요
    private String name;
    private int age;
    private String jong;

    public void setname(String name){
        this.name = name;
    }
    public  void setAge(int age){
        this.age = age;
    }
    public  void setJong(String jong){
        this.jong = jong;
    }
    public String getMax(){
        String text = "강아지의 이름 " + this.name + " 나이는 " + this.age + " 살 종은 " + this.jong;
        return text;
    }

}
