public class Person implements AccountOperations {
    private int nid;
    private Account acc[];

    public Person(int nid, int arraySize) {
        this.nid = nid;
        this.acc = new Account[arraySize];
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getNid() {
        return nid;
    }

    @Override
    public void addAccount(Account ac1) {
        int count = 0;
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] == null) {
                acc[i] = ac1;
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Account Inserted!");
        } else {
            System.out.println("Account can't insert!");
        }
    }

    @Override
    public void removeAccount(Account ac2) {
        int count = 0;
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] == ac2) {
                acc[i] = null;
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Account successfully removed!");
        } else {
            System.out.println("Account doesn't removed.");
        }
    }

    @Override
    public void showAccount() {
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] != null) {
                acc[i].show();
            }
        }
    }
}
