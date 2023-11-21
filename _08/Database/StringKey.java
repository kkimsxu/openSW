package _08.Database;

public class StringKey implements Key{
    private String k;

    public StringKey(String key) {
        k = key;
    }

    @Override
    public boolean equals(Key m) {
        if (m instanceof StringKey) {
            return k.equals(((StringKey) m).getString());
        }
        return false;
    }

    public String getString() {
        return k;
    }

    public static void main(String[] args) {
        Database db = new Database(4);

        BankAccount a1 = new BankAccount(50000, new IntegerKey(55));
        Key k = new StringKey("열려라");
        BankAccount a2 = new BankAccount(10000, k);
        boolean transaction1 = db.insert(a1);
        boolean transaction2 = db.insert(a2);

        Record p = db.find(k);
        BankAccount q = (BankAccount) p;
        System.out.println(q.getBalance());

        k = q.getKey();
        if (k instanceof IntegerKey)
            System.out.println(((IntegerKey) k).getInt());
        else if (k instanceof StringKey)
            System.out.println(((StringKey) k).getString());
        else
            System.out.println("모르는 Key 출현 오류");
    }
}
