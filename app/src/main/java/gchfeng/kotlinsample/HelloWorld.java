/**
 * Created by gchfeng on 2017/5/24.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    public boolean hasEmpty(String... array) {
        for (String s : array) {
            if (s == null || "".equals(s)) {
                return true;
            }
        }
        return false;
    }


    public int getLargerNum(int x, int y) {
        return x > y ? x : y;
    }
}


