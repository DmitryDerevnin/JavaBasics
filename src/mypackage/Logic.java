package mypackage;

public class Logic {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning) {
            if (!isMom | isAsleep)
                return false;
        }
        if(isAsleep)
            return false;
        return true;
    }
}
