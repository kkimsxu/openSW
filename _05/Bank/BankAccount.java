package _05.Bank;

import javax.swing.*;

public class BankAccount {
    private int balance;
    private int interest;
    public BankAccount(int initial_amount) {
        if (initial_amount >= 0)
            balance = initial_amount;
        else balance = 0;
    }
    public boolean deposit(int amount) {
        boolean result = false;
        if (amount >= 0) {
            balance = balance + amount;
            result = true;
        }
        else JOptionPane.showMessageDialog(null, "입금액에 문제가 있어서 입금이 취소되었습니다.");
        return result;
    }
    public boolean withdraw(int amount) {
        boolean result = false;
        if (amount < 0) {
            JOptionPane.showMessageDialog(null, "출금액에 문제가 있어서 출금이 취소되었습니다.");
        }
        else if (amount > balance) {
            JOptionPane.showMessageDialog(null, "출금액이 잔고액보다 많아서 출금이 취소되었습니다.");
        }
        else {
            balance = balance - amount;
            result = true;
        }
        return result;
    }

    public boolean earnInterest(int amount) {
        boolean result = false;
        if (balance == 0) {
            JOptionPane.showMessageDialog(null, "현재 잔고가 0원으로 지급할 이자가 없습니다.");
        }
        else if (amount >= 0 && amount <= 100) {
            interest = (int)(balance*amount*0.01);
            balance = balance + interest;
            result = true;
        }
        else {
            JOptionPane.showMessageDialog(null, "이자율 입력에 오류가 있습니다.");
        }
        return result;
    }

    public int Interest() {
        return interest;
    }
    public int getBalance() {
        return balance;
    }
}
