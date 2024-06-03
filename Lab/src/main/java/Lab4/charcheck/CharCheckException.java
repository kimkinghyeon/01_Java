package Lab4.charcheck;

import Lab4.charcheck.number.GongBackNegativeException;

public class CharCheckException {
    public void processTest(String n) throws GongBackNegativeException {

        if (n == null){

            throw new GongBackNegativeException("공백 빼");

        } else {

            System.out.println(n);
        }

    }
}
