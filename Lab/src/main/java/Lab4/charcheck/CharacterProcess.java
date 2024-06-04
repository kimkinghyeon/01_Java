package Lab4.charcheck;



public class CharacterProcess {
    public int countAlpha(String s) {

        char[] arr = new char[s.length()];
        int count = 0;

        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    throw new CharCheckException(s);
                }
            }
            System.out.println("입력하신 문자열은 "+s+"입니다!");
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
                count++;
            }
        } System.out.println("입력하신 문자열에서 영문자는 총 "+count+"개 있습니다.");



        return s.length();
    } catch (CharCheckException cc) {
        System.out.println("체크할 문자열 안에 공백 포함할 수 없습니다.");
        cc.printStackTrace();
    }
		return 0;
}

public Characterprocess() {
    super();
}




