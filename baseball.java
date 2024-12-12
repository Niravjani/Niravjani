import java.util.ArrayList;
import java.util.List;

public class baseball{
    //https://leetcode.com/problems/baseball-game/
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int sum =0;
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C" ) && !operations[i].equals("D" ) &&!operations[i].equals("+")) {
                int  roundScore =Integer.valueOf(operations[i]);
               sum += roundScore;
                list.add(roundScore);
            }
            else if (operations[i].equals("C")){
                sum -=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
            else if(operations[i].equals("D")){
                int  roundScore =2*list.get(list.size()-1);
                sum+= roundScore;
                list.add(roundScore);
            }
            else{
                int roundScore =list.get(list.size()-1) + list.get(list.size()-2);
                sum+= roundScore;
                list.add(roundScore);
            }
        }
        return sum;
    }
}