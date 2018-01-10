package inheritance.bankexample;

import inheritance.bankexample.Bank;
import inheritance.bankexample.BankAccount;
import inheritance.bankexample.Client;

public class BankTest {

    public static void main(String []str){

        Bank bank = new Bank();
        Client avi = new Client("avi", 55);
        Client moshe = new Client("moshe", 33);

        BankAccount aviAccount =  bank.createAccount(avi);// create account for avi
        BankAccount mosheAccount =  bank.createAccount(moshe);// create account for moshe
          bank.removeAccount(avi);
          aviAccount =  bank.getAccount(avi);
          //aviAccount.deposit(658);// deposit for moshe 66 nis
         // System.out.println(mosheAccount.getBalance());
         // System.out.println(mosheAccount.getPassword());

//        System.out.println(aviAccount.getBalance());
//        System.out.println(mosheAccount.getBalance());
//
       // moshe.transfer(60,moshe);
        //moshe = bank.getAccount(avi);//

      //  System.out.println(moshe.getBalance());
       // System.out.println( moshe.getBalance());
    }
}
