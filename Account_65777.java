class Account_65777 {
    int id;
    String name;
    int balance;

    Account_65777() {
        balance = 0;
    }

    Account_65777(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    int credit(int amount) {
        balance -= amount;
        return balance;
    }

    int debit(int amount) {
        if (balance >= amount)
            balance -= amount;
        return balance;
    }

    int transferTo(Account_65777 acct, int amount) {
        if (balance >= amount) {
            balance -= amount;
            acct.balance += amount;
        }
        return balance;
    }

    public String toString() {
        return String.format("Account %s(%d) balance is %d", name, id, balance);
    }

    // public static void main(String[] args) {
    // Account_65777 acc1 = new Account_65777(1, "Tsuki", 10000);
    // Account_65777 acc2 = new Account_65777(2, "Test", 2345);

    // System.out.println(acc1);
    // System.out.println(acc2);
    // System.out.println();

    // acc1.debit(1777);
    // acc2.credit(3845);

    // System.out.println(acc1);
    // System.out.println(acc2);
    // System.out.println();

    // acc2.transferTo(acc1, 100);
    // acc1.transferTo(acc2, 2000);

    // System.out.println(acc1);
    // System.out.println(acc2);
    // }
}
