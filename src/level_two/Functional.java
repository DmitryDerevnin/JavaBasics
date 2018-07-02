package level_two;

import java.util.ArrayList;
import java.util.List;

public class Functional {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> outString = new ArrayList<Integer>();
        for(int i = 0; i<nums.size(); i++){
            if(nums.get(i)>=0){
                outString.add(nums.get(i));
            }
        }
        return outString;
    }

    public List<String> noLong(List<String> strings) {
        List<String> outString = new ArrayList<String>();
        for(int i=0; i<strings.size(); i++){
            if(strings.get(i).length() <4)
                outString.add(strings.get(i));
        }
        return outString;
    }

    public List<String> no34(List<String> strings) {
        List<String> outString = new ArrayList<String>();
        for(int i=0; i<strings.size(); i++){
            if(strings.get(i).length() !=3)
                if (strings.get(i).length() != 4)
                    outString.add(strings.get(i));
        }
        return outString;
    }
}
