package _06;

public class TextSearch_for {
    public int findchar(char c, String s) {
        int index;
        for (index = 0; index < s.length() && s.charAt(index) != c; index++);
        if (index == s.length())
            index = -1;
        return index;
    }
    public static void main(String[] args) {
        TextSearch_while pr = new TextSearch_while();
        System.out.println(pr.findchar('a', "Hanyang"));
    }
}
