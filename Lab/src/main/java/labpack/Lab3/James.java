package labpack.Lab3;

public class James {
    String name;
    int age;
    String mery;
    int son;
    //나이가 30살이고 이름이 James인 남자가 있습니다.
    // 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    public void setName(String name){
        this.name = name;
    }
    public  void setAge(int age){
        this.age = age;
    }
    public  void setMery(String mery){
        this.mery = mery;
    }
    public void setSon(int son){
        this.son = son;
    }
    public String getJames(){
        String text =  "이름 " + this.name + " 나이는 " + this.age + " 세 결혼유무 " + this.mery + " 자식의 수 " + this.son + "입니다";
        return text;
    }
}
