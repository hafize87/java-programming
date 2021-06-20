package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.user = "husband";
        System.out.println(bankAccount1.showBalance());   // 50



        bankAccount1.spend(10);
        System.out.println(bankAccount1.showBalance());   // 40


        BankAccount bankAccount2 = new BankAccount();

        bankAccount2.user = "wife";
        System.out.println(bankAccount2.showBalance());  // 40  --> static oldugu icin yeni object create ettigimiz halde 50 yi gostermiyo

        bankAccount2.spend(20);
        bankAccount2.showBalance();

        System.out.println(bankAccount1.showBalance());  // 20
    }
}