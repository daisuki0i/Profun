import java.util.ArrayList;

public class AcctList_65777 {
    public static void main(String[] args) {
        testAccount();
        testAcctList();
    }

    static void testAcctList() {
        ProFun12_AcctList clients = new ProFun12_AcctList();
        String startWith = "c";
        System.out.println("List of account name start with " + startWith.toUpperCase());
        System.out.println(clients.filterName(startWith.toUpperCase()));
        int bound = 1400;
        System.out.println("List of account balance less than " + bound);
        System.out.println(clients.balanceLessThan(bound));
    }

    static void testAccount() {
        Account_65777 acct1 = new Account_65777(1, "melon", 1500);
        Account_65777 acct2 = new Account_65777(2, "rose apple", 2200);
        System.out.println(acct1.credit(700)); // 2200
        System.out.println(acct2.debit(300)); // 1900
        System.out.println(acct1.transferTo(acct2, 1000)); // 2200
        System.out.println(acct1.credit(-50)); // 1200
        System.out.println(acct2.debit(-50)); // 2900
        System.out.println(acct1);
        System.out.println(acct2);
    }
}

class ProFun12_AcctList {
    ArrayList<Account_65777> acctList;

    ProFun12_AcctList() {
        acctList = new ArrayList<>();
        acctList.add(new Account_65777(1, "Cactus", 1000));
        acctList.add(new Account_65777(2, "Celsia", 500));
        acctList.add(new Account_65777(3, "Clove pink", 1500));
        acctList.add(new Account_65777(4, "Crown Imperial", 900));
        acctList.add(new Account_65777(5, "Daffodil", 1200));
        acctList.add(new Account_65777(6, "Daisy", 1700));
        acctList.add(new Account_65777(7, "Dandelion", 500));
        acctList.add(new Account_65777(8, "Dittany", 600));
    }

    ArrayList<Account_65777> filterName(String c) {
        ArrayList<Account_65777> result = new ArrayList<>();
        for (int i = 0; i < acctList.size(); i++) {
            // System.out.println(acctList.get(i));
            Account_65777 curAcct = acctList.get(i);
            String acctName = curAcct.getName();
            if (acctName.startsWith(c)) {
                // System.out.println(curAcct.getName());
                result.add(curAcct);
            }
        }
        return result;
    }

    ArrayList<Account_65777> balanceLessThan(int b) {
        ArrayList<Account_65777> result = new ArrayList<>();
        for (int i = 0; i < acctList.size(); i++) {
            Account_65777 curAcct = acctList.get(i);
            int acctBalance = curAcct.getBalance();
            if (acctBalance < b) {
                // System.out.println(acctBalance);
                result.add(curAcct);
            }
        }

        return result;
    }
}