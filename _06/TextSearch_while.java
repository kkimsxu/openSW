package _06;

public class TextSearch_while {
    public int findchar(char c, String s) {
        boolean found = false;
        int index = 0;
        while (!found && index < s.length()) {
            if (s.charAt(index) == c)
                found = true;
            else index = index + 1;
        }
        if (!found)
            index = -1;
        return index;
    }
    public static void main(String[] args) {
        TextSearch_while pr = new TextSearch_while();
        System.out.println(pr.findchar('a', "Hanyang"));
    }
}
