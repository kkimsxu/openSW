package _05.DiceGame;


import _05.DiceGame.Player;

import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private int size = 400;
    private Player player1, player2;

    public GameBoard(Player p1, Player p2) {
        player1 = p1;
        player2 = p2;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("DiceGame");
        frame.setSize(size, size);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, size, size);

        g.setColor(Color.blue);
        g.drawString(player1.name(), 85, 100);
        g.drawString(Integer.toString(player1.points()), 100, 150);
        g.drawString(Integer.toString(player1.rolled().face1()), 80, 200);
        g.drawString(Integer.toString(player1.rolled().face2()), 120, 200);

        g.setColor(Color.red);
        g.drawString(player2.name(), 285, 100);
        g.drawString(Integer.toString(player2.points()), 300, 150);
        g.drawString(Integer.toString(player2.rolled().face1()), 280, 200);
        g.drawString(Integer.toString(player2.rolled().face2()), 320, 200);

        g.setColor(Color.black);
        if (player1.wins()) {g.drawString("이겼다!", 85, 250);}
        else if (player2.wins()) {g.drawString("이겼다!", 285, 250);}
        else {g.drawString("비겼습니다", 185, 250);}
    }
}