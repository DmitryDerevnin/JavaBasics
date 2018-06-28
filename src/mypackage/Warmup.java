package mypackage;

public class Warmup {

    public String backAround(String str) {
        char lastChar = str.charAt(str.length()-1);
        String newString = lastChar + str + lastChar;
        return newString;
    }

    public boolean or35(int n) {
        if(n%3 == 0){
            return true;
        }
        if(n%5 ==0){
            return true;
        }
        return false;
    }

    public boolean in3050(int a, int b) {
        if(a>=30 & a<=40){
            if(b>=30 & b<=40){
                return true;
            }
        }
        if(a>=40 & a<=50){
            if(b>=40 & b<=50){
                return true;
            }
        }
        return false;
    }
}
