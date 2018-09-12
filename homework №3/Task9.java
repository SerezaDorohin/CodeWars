import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(findLongest(new int[]{12,56,45,6,12,31,234,56,4,12,31,23}));
    }

    public static int findLongest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

}
