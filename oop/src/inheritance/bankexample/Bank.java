package inheritance.bankexample;

public class Bank {
    private BankAccount bankAccount;
    private BankAccount ba;
    private BankAccount[] bl = new BankAccount[0];
    private BankAccount[] tempArr;
    //private LinkedList<inheritance.bankexample.BankAccount> bankAccounts = new LinkedList<>();

    public Bank() {
    }

    public BankAccount createAccount(Client client) {
        System.out.println("This is " + client.getName() + " New Account");
        ba = BankAccount.accountInstance(client);
        add(ba);
        return ba;
    }

    public BankAccount getAccount(Client client) {
        BankAccount account = null;
        if (bl.length != 0) {
            for (BankAccount ba : bl) {
                if (ba.getId() == client.getId()) {
                    account = ba;

                }
                else System.out.println("NO such Account !");
            }

        }
        return account;
    }


    private void add(BankAccount ba) {
        tempArr = new BankAccount[bl.length + 1];


        for (int i = 0; i < bl.length; i++) {
            tempArr[i] = bl[i];

        }

        tempArr[tempArr.length-1] = ba;
        bl = tempArr;
    }

    public void removeAccount(Client client) {
        if (bl.length != 0) {
            int counter = 0;
            tempArr = new BankAccount[bl.length-1];

            for (int i = 0; i <bl.length ; i++) {
                if (bl[i].getId() == client.getId()){
                    counter = 1;
                }
                else {
                    tempArr[i - counter] = bl[i];
                }
            }
            bl = tempArr;
        }
    }
}

