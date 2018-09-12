import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("Программа запущена");
        System.out.println((presses("OLEG")));
    }
    public static int end;
    public static int presses(String phrase) {
        end=0;
        String[] phraseSymbols = phrase.split("");
        for (int i=0;i<phraseSymbols.length;i++){
            end+=tester(phraseSymbols[i]);
        }
        return end;
    }



    public static int tester(String symbol){
        return symbol.contains("A") ? 1 : symbol.contains("B") ? 2 : symbol.contains("C") ? 3 : symbol.contains("D") ? 1 : symbol.contains("E") ? 2 : symbol.contains("F") ? 3 :
                symbol.contains("G") ? 1 : symbol.contains("H") ? 2 : symbol.contains("I") ? 3 : symbol.contains("J") ? 1 : symbol.contains("K") ? 2 : symbol.contains("L") ? 3 :
                        symbol.contains("M") ? 1 : symbol.contains("N") ? 2 : symbol.contains("O") ? 3 : symbol.contains("P") ? 1 : symbol.contains("Q") ? 2 : symbol.contains("R") ? 3 :
                                symbol.contains("S") ? 4 : symbol.contains("T") ? 1 : symbol.contains("U") ? 2 : symbol.contains("V") ? 3 : symbol.contains("W") ? 1 :
                                        symbol.contains("X") ? 2 : symbol.contains("Y") ? 3 : symbol.contains("Z") ? 4 : symbol.contains(" ") ? 1 : symbol.contains("0") ? 2 :
                                                symbol.contains("*") ? 1 : symbol.contains("#") ? 1 : symbol.contains("1") ? 1 : symbol.contains("2") ? 4 :
                                                        symbol.contains("3") ? 4 : symbol.contains("4") ? 4 : symbol.contains("5") ? 4 : symbol.contains("6") ? 4 : symbol.contains("7") ?
                                                                5 : symbol.contains("8") ? 4 : symbol.contains("9") ? 5 : 1;

    }
    /*------- ------- -------
            |     | | ABC | | DEF |
            |  1  | |  2  | |  3  |
            ------- ------- -------
            ------- ------- -------
            | GHI | | JKL | | MNO |
            |  4  | |  5  | |  6  |
            ------- ------- -------
            ------- ------- -------
            |PQRS | | TUV | | WXYZ|
            |  7  | |  8  | |  9  |
            ------- ------- -------
            ------- ------- -------
            |     | |space| |     |
            |  *  | |  0  | |  #  |
            ------- ------- -------
            */
}
