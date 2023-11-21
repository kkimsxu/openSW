

import javax.swing.*;
import java.awt.*;

public class simple extends JFrame {

    public simple() {
        Container cp = getContentPane(); //패널을 만들어줌
        cp.setLayout(new FlowLayout()); //레이아웃 설정
        JLabel label = new JLabel("OK 누르세요!!"); //라벨과 버튼 만들기
        JButton button = new JButton("OK");
        cp.add(label); //패널에 라벨과 버튼 넣기
        cp.add(button);

        setVisible(true);
        setSize(300, 65);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new simple();
    }
}
