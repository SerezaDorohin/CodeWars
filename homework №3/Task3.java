public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(lostSheeps(new int[]{2,3}, new int[]{3,4}, 15));
    }

    public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
        int summ=0;
        for (int i=0;i<fridayNightCounting.length;i++){
            summ+=fridayNightCounting[i];
        }
        for (int n=0;n<saturdayNightCounting.length;n++){
            summ+=saturdayNightCounting[n];
        }
        return sheepsTotal-summ;
    }


}
