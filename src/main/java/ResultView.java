import java.util.HashMap;

public class ResultView {
    public static void printCount(HashMap<String, Integer> finalCount) {
        System.out.println("3개 일치 (5000원)- " + finalCount.get("3개") +"개");
        System.out.println("4개 일치 (50000원)- " + finalCount.get("4개") +"개");
        System.out.println("5개 일치 (1500000원)- " + finalCount.get("5개") +"개");
        System.out.println("6개 일치 (2000000000원)- " + finalCount.get("6개") +"개");
    }
}
