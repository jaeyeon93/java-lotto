import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Money {
    static ArrayList<Integer> totalMoney = new ArrayList<>();
    static HashMap<String, Integer> finalCount;
    ArrayList<Integer> addMoney = new ArrayList<Integer>(Arrays.asList(5000, 50000, 1500000, 2000000000));

    static {
        finalCount = new HashMap<String, Integer>();
        finalCount.put("3", 0);
        finalCount.put("4", 0);
        finalCount.put("5", 0);
        finalCount.put("6", 0);
    }

    public void money(ArrayList<Integer> counts) {
        for(int i = 0; i < counts.size(); i++) {
            countAdd(counts, i);
        }
    }

    public ArrayList<Integer> countAdd(ArrayList<Integer> counts, int i) {
        int num = Integer.parseInt(String.valueOf(counts.get(i)));
//        int num = finalCount.get(String.valueOf(i));
        if (num > 2) {
            finalCount.put(String.valueOf(i), ++num);
            totalMoney.add(addMoney.get(num - 3));
        }
//        System.out.println("value of count.get is " + String.valueOf(counts.get(i)));

//        if(counts.get(i) == 3) {
//            int num = finalCount.get("3");
//            finalCount.put("3", ++num);
//            totalMoney.add(5000);
//        }
//
//
//        if(counts.get(i) == 4) {
//            int num = finalCount.get("4");
//            finalCount.put("4", ++num);
//            totalMoney.add(50000);
//        }
//
//        if(counts.get(i) == 5) {
//            int num = finalCount.get("5");
//            finalCount.put("5", ++num);
//            totalMoney.add(1500000);
//        }
//
//        if(counts.get(i) == 6) {
//            int num = finalCount.get("6");
//            finalCount.put("6", ++num);
//            totalMoney.add(2000000000);
//        }

        return totalMoney;
    }

    public Integer totalMoney(ArrayList<Integer> totalMoney) {
        int sum = 0;
        for(int i = 0; i < totalMoney.size(); i++)
            sum += totalMoney.get(i);
        return sum;
    }

    public Integer profit(int profit, int output) {
        return (profit / output) * 100;
    }
}
