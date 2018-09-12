public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(countBits(1234));
    }

    public static int countBits(int n) {
        String str = Integer.toBinaryString(n);
        int countOnes = 0;
        for (char element : str.toCharArray()){
            if (element == '1') countOnes++;
        }
        return countOnes;
    }


}
