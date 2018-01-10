package inheritance.bankexample;

public class Client {

    private String name;
    private int id;




    //BankAccount[] accounts;

    //makeDeposit(amount, BA)
    //makeWithdraw(amount, BA)
    //transfer


    public Client(String name, int id){
        this.name =  name;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
