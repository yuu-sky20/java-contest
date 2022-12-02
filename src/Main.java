import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        // リストを宣言
        List<Integer> score = new ArrayList<>();
        int n = 80;
        for(int i = 0; i < 6; i++) {
            score.add(n);
            n -= 10;
        }

        // scoreを逆順に入れ替える
        Collections.reverse(score);
        for (int v : score) {
            System.out.println(v);
        }
    }
}