public class main {
        public static void main(String[] args) {
            System.out.println("Программа запущена");
            System.out.println((accum("HbideVbxncC")));
        }

        public static String str;

        public static String accum(String s) {
            str="";
            String[] symbols = s.split("");
            for (int i = 0; i < symbols.length; i++) {
                String symbol = symbols[i];
                symbols[i] = out(symbol, i);
            }
            int i = 0;
            while (i < symbols.length) {
                str += symbols[i];
                if (i+1==symbols.length){

                } else {
                    str+= "-";
                }
                i++;
            }

            return str;
        }

        public static String endOut;

        public static String out(String symbol, int num) {
            endOut = symbol.toUpperCase();
            int i = 0;
            while (i < num) {
                endOut+=symbol.toLowerCase();
                i++;
            }
            return endOut;
        }
    }