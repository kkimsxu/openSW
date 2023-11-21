package _09.Counter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitButton extends JButton implements ActionListener {
    public ExitButton(String label) {
        super(label);
        addActionListener(this);
    }

    /** actionPerformed '버튼 누르기' 액션 이벤트를 처리
     * @param e 이벤트 */
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
