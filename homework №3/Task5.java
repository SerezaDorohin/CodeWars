public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println(decode(".... . -.--  .--- ..- -.. ."));//Выдаст HEY JUDE
    }

    public static String decode(String morseCode) {
        String[] words = morseCode.split("\\s{2}");
        StringBuilder end = new StringBuilder();
        for (String word : words) {
            end.append(' ');
            String[] letters = word.split("\\s");
            for (String letter : letters) {
                end.append(decod(letter));
            }
        }
        end.replace(0,1,"");
        return end.toString();
    }

    public static String decod(String toEncode) {
        String morse = toEncode;
        if (toEncode.equalsIgnoreCase(" ")) {
            morse = " "; }
        if (toEncode.equalsIgnoreCase(".-"))
            morse = "A";
        if (toEncode.equalsIgnoreCase("-..."))
            morse = "B";
        if (toEncode.equalsIgnoreCase("-.-."))
            morse = "C";
        if (toEncode.equalsIgnoreCase("-.."))
            morse = "D";
        if (toEncode.equalsIgnoreCase("."))
            morse = "E";
        if (toEncode.equalsIgnoreCase("..-."))
            morse = "F";
        if (toEncode.equalsIgnoreCase("--."))
            morse = "G";
        if (toEncode.equalsIgnoreCase("...."))
            morse = "H";
        if (toEncode.equalsIgnoreCase(".."))
            morse = "I";
        if (toEncode.equalsIgnoreCase(".---"))
            morse = "J";
        if (toEncode.equalsIgnoreCase("-.-"))
            morse = "K";
        if (toEncode.equalsIgnoreCase(".-.."))
            morse = "L";
        if (toEncode.equalsIgnoreCase("--"))
            morse = "M";
        if (toEncode.equalsIgnoreCase("-."))
            morse = "N";
        if (toEncode.equalsIgnoreCase("---"))
            morse = "O";
        if (toEncode.equalsIgnoreCase(".--."))
            morse = "P";
        if (toEncode.equalsIgnoreCase("--.-"))
            morse = "Q";
        if (toEncode.equalsIgnoreCase(".-."))
            morse = "R";
        if (toEncode.equalsIgnoreCase("..."))
            morse = "S";
        if (toEncode.equalsIgnoreCase("-"))
            morse = "T";
        if (toEncode.equalsIgnoreCase("..-"))
            morse = "U";
        if (toEncode.equalsIgnoreCase("...-"))
            morse = "V";
        if (toEncode.equalsIgnoreCase(".--"))
            morse = "W";
        if (toEncode.equalsIgnoreCase("-..-"))
            morse = "X";
        if (toEncode.equalsIgnoreCase("-.--"))
            morse = "Y";
        if (toEncode.equalsIgnoreCase("--.."))
            morse = "Z";
        if (toEncode.equalsIgnoreCase("-----"))
            morse = "0";
        if (toEncode.equalsIgnoreCase(".----"))
            morse = "1";
        if (toEncode.equalsIgnoreCase("..---"))
            morse = "2";
        if (toEncode.equalsIgnoreCase("...--"))
            morse = "3";
        if (toEncode.equalsIgnoreCase("....-"))
            morse = "4";
        if (toEncode.equalsIgnoreCase("....."))
            morse = "5";
        if (toEncode.equalsIgnoreCase("-...."))
            morse = "6";
        if (toEncode.equalsIgnoreCase("--..."))
            morse = "7";
        if (toEncode.equalsIgnoreCase("---.."))
            morse = "8";
        if (toEncode.equalsIgnoreCase("----."))
            morse = "9";
        if (toEncode.equalsIgnoreCase("|"))
            morse = "";

        return morse;
    }


}
