/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
*/

public class Kata {
    public static int findShort(String s) {
        int end = Integer.MAX_VALUE;//Макс. значение
        String[] words=s.split("\\s");//Разделяет слова
        for (int i=0;i<words.length;i++) {
        end = Math.min(end, words[i].length());//Находим минимум
        }
        return end;//Возвращаем
    }
}