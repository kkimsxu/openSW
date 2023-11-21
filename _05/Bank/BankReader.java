package _05.Bank;

import javax.swing.*;

public class BankReader {
    private String input_line;
    public BankReader() {
        input_line = "";
    }

    public char readCommand(String message) {
        input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
        //trim() 앞뒤 공백제거
        //toUpperCase() 대문자로 변환
        return input_line.charAt(0);
        //charAt() 지정 인덱스값 반환
    }
    public int readAmount() {
        int amount = 0;
        String s = input_line.substring(1, input_line.length());
        //substring(int beginIndex, int endIndex) 지정 범위 문자들 추출
        s = s.trim();
        if (s.length() > 0)
            amount = Integer.parseInt(s);
        else JOptionPane.showMessageDialog(null, "금액 입력 오류");
        return amount;
    }
}
