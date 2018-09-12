import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        ArrayList<String> a = new ArrayList<String>();
        int[] array = sortArray(new int[]{-1,1,3,2,5});
        System.out.println(Arrays.toString(array));
    }

    public static int[] sortArray(int[] ar){
        Arrays.sort(ar);
        return ar;
    }

}
