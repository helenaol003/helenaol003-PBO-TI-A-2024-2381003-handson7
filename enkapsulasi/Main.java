package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount helenaOneziaLewi = new BankAccount(100);

        //Beli minuman 10 (withdraw)
        helenaOneziaLewi.withdraw(10);
        System.out.println("Current balance is: " +helenaOneziaLewi.getBalance());
    }
}
