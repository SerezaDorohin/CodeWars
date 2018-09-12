
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(dashatize(5311));
    }

    public static boolean end;
    public static StringBuilder str = new StringBuilder();

    public static String dashatize(int num) {
        end = true;
        String numStr = String.valueOf(num);
        String[] nums = numStr.split("");
        for (int i = 0; i < nums.length; ) {
            if (tester(nums[i]) == false) {
                if (i!=0) {
                    str.append("-");
                }
            }
            str.append(nums[i]);
            if (tester(nums[i]) == false) {
                if (nums.length - 2 == i) {
                    if (tester(nums[i + 1]) == true) {
                        str.append("-");
                    }
                }
            }
            i++;
        }
        return str.toString();
    }

    public static boolean tester(String symbol) {
        int num = Integer.parseInt(symbol);
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
/*Given a number, return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.*/
