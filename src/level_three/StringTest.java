package level_three;

import java.util.ArrayList;

public class StringTest {

    public int sumDigits(String str) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            list.add(i);
        }
        int a = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                a = a + Character.getNumericValue(str.charAt(i));
            }
        }
        return a;
    }
}
