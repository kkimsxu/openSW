package _09.Counter;

public class CounterStarter {
    public static void main(String[] args) {
        Counter model = new Counter(0);
        Drawing drawing = new Drawing(model);
        CounterFrame view = new CounterFrame(model, drawing);
    }
}
