package _05.DiceGame;

public class Dealer {

    public void dealDicegame(Player p1, Player p2, GameBoard b, Registrar r) {

        Player first, second;
        first = p1; second = p2;


        first.play(new Dice());
        second.play(new Dice());

        Dice d1 = first.rolled();
        Dice d2 = second.rolled();

        if (d1.twin() && d2.twin()) {
            if (d1.sum() > d2.sum())
                beats(first, b);
            else if (d1.sum() < d2.sum())
                beats(second, b);
            else
                b.repaint();
        }
        else if (d1.twin())
            beats(first, b);
        else if (d2.twin())
            beats(second, b);
        else {
            if (d1.sum() > d2.sum())
                beats(first, b);
            else if (d1.sum() < d2.sum())
                beats(second, b);
            else if (d1.diff() < d2.diff())
                beats(first, b);
            else if (d1.diff() > d2.diff())
                beats(second, b);
            else
                b.repaint();
        }

        if (r.wantToContnue() == 0) {
            p1.reset();
            p2.reset();
            this.dealDicegame(p1, p2, b, r);
        }
        else
            System.exit(0);
    }

    private void beats(Player p1, GameBoard b)  {
        p1.receivePoint();
        b.repaint();
    }

}