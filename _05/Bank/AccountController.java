package _05.Bank;

public class AccountController {
    private BankReader reader;
    private BankWriter writer;
    private BankAccount account;

    public AccountController(BankReader r, BankWriter w, BankAccount a) {
        reader = r;
        writer = w;
        account = a;
    }
    public void processTransactions() {
        char command = reader.readCommand("입금 D금액, 출금 W금액, 이자 E이자율, 종료 Q");
        if (command == 'Q') {
            writer.showTransaction("서비스를 마칩니다.");
            return;
        }
        else if (command == 'D') {
            int amount = reader.readAmount();
            if (account.deposit(amount))
                writer.showTransaction(amount, "입금");
            else writer.showTransaction("입금 실패");
        }
        else if (command == 'W') {
            int amount = reader.readAmount();
            if (account.withdraw(amount))
                writer.showTransaction(amount, "출금");
            else writer.showTransaction("출금 실패");
        }
        else if (command == 'E') {
            int amount = reader.readAmount();
            if (account.earnInterest(amount))
                writer.showTransaction();
            else
                writer.showTransaction("이자 요청 오류");
        }
        else writer.showTransaction("요청 오류");

        this.processTransactions();
    }
}
