package BankingSystem;

public class MainBankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("Ahmed", "1", "123");
        Account account1 = new Account("1" , 10, customer1);
        Account account3 = new Account("3" , 30, customer1);

        bank.addCustomer("Ali", "2", "1234");
        bank.createAccount("2" , 20, bank.findCustomerById("2"));

        bank.addCustomer("Noor", "3", "1235");
        bank.createAccount("4" , 40, bank.findCustomerById("3"));


        customer1.addAccount(account1);
        customer1.addAccount(account3);
        System.out.println(customer1.toString());
        System.out.println(customer1.getAccounts());

        System.out.println(account1.toString());
        account1.deposit(5);
        System.out.println(account1.getBalance());
        account1.withdraw(2);
        System.out.println(account1.getBalance());
        System.out.println(account1.toString());

        bank.showAllCustomers();
        bank.showAllAccounts();
        System.out.println(bank.findCustomerById("1"));  System.out.println(" ");
        System.out.println(bank.findAccountById("4"));    System.out.println(" ");
    }
}
