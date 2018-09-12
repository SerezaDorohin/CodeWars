import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println((findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5})));
    }
    public static int findIt(int[] a) {
        Set<Integer> test = new HashSet<Integer>();
        for (int i = 0;i<a.length;i++){
            int num = a[i];
           if (test.contains(num)){
               test.remove(num);
           } else {
               test.add(num);
           }
        }
        Iterator<Integer> integerIterator = test.iterator();
        return integerIterator.next();
    }
}