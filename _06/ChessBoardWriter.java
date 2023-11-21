package _06;

import javax.swing.*;
import java.awt.*;

public class ChessBoardWriter extends JPanel {
    private int number_of_rows;
    private int square_size;
    private int panel_width;
    private int offset = 20;

    public ChessBoardWriter(int rows, int size) {
        number_of_rows = rows;
        square_size = size;
        panel_width = number_of_rows * square_size + 2 * offset;

        JFrame f = new JFrame();
        f.getContentPane().add(this);
        f.setTitle("Chess Board");
        f.setSize(panel_width, panel_width + 28);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, panel_width, panel_width);
        paintBoard(offset, offset, number_of_rows, square_size, g);
    }
    private void paintBoard(int start_x, int start_y, int rows, int size, Graphics g) {
        for (int x = 0; x< rows; x = x + 1) {
            int x_position = start_x + x * size;
        }
    }
}
