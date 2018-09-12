import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        ArrayList<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        System.out.println(countSmileys(a));
    }
    /*@Test
    public void test2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, SmileFaces.countSmileys(a));
    }*/
    //НА КОДВАРСЕ В ЭТОМ ТЕСТЕ ВЫДАЁТ 3, ХОТЯ В ПРОГРАММЕ 1.

    public static int i;

    public static int countSmileys(List<String> arr) {
        for (int b = 0; b < arr.size(); b++) {
            String ar = arr.get(b);
            if (test(ar)) {
                i++;
            }
        }


        return i;
    }

    public static boolean test(String symbol) {
        if (symbol.equals(":D")) {
            return true;
        } else if (symbol.equals(";D")) {
            return true;
        } else if (symbol.equals(":)")){
            return true;
        } else if (symbol.equals(":-D")){
            return true;
        } else if (symbol.equals(";-D")){
            return true;
        } else if (symbol.equals(":-)")){
            return true;
        } else if (symbol.equals(";-)")){
            return true;
        } else if (symbol.equals(":~D")){
            return true;
        } else if (symbol.equals(";~D")){
            return true;
        } else if (symbol.equals(":~)")){
            return true;
        } else if (symbol.equals(";~)")){
            return true;
        } else {
            return false;
        }



    }

}
