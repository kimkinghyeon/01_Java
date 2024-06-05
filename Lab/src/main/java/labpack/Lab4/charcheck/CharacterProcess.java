package labpack.Lab4.charcheck;

public class CharacterProcess {
    public int countAlpha(String s) {

        char[] arr = new char[s.length()];

        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    throw new CharCheckException(s);
                }

                System.out.println("입력 " + s);

            }

            return s.length();
        } catch (CharCheckException cc) {
            System.out.println("공백 빼");
            cc.printStackTrace();
        }
        return 0;
    }

    public CharacterProcess() {
        super();
    }
}





