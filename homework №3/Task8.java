public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(isSquare(12));
    }

    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n); // fix me!
    }

}