package Lab3;

public class Tesla_Model_S {
    //Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.
    String model;
    int chur;
    String zungi;
    int son;
    //나이가 30살이고 이름이 James인 남자가 있습니다.
    // 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
    public void setModel(String model){
        this.model = model;
    }
    public  void setChur(int chur){
        this.chur = chur;
    }
    public  void setZungi(String zungi){
        this.zungi = zungi;
    }
    public String getTesla(){
        return "모델명 " + this.model + " 출시년 " + this.chur + " 이 자동차는 " + this.zungi + " 입니다. ";
    }

}

