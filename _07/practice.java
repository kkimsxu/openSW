package _07;

public class practice {
    private String suit;
    private int rank;
    public String DIAMOND = "DIamond";
    // 객체의 필드를 쓰려면 객체(Card)가 있어야 함
    public practice(String s, int r) {
        suit = s;
        rank = r;
    }
    public String getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }

    public static void main(String[] args) {
        practice joker = new practice("", 0);
        // 객체의 필드를 쓰려면 객체(Card)가 있어야 함 -> 아무런 객체 만들어줌.
        practice diamondAce = new practice(joker.DIAMOND, 1);
        System.out.println(diamondAce.getSuit() + diamondAce.getRank());
    }
}
