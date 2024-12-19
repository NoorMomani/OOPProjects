package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts;
    List<Customer> customers;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public Customer addCustomer(String name , String customerId , String phone){
        Customer newCustomer = new Customer(name, customerId,phone);
        customers.add(newCustomer);
        return newCustomer;
    }

    public Account createAccount(String accountId, double balance, Customer customer){
        Account newAccount = new Account(accountId, balance, customer);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        return newAccount;
    }

    public Customer findCustomerById(String customerId){
      for(Customer customer : customers){
          if(customer.getCustomerId().equals(customerId)){
              return customer;
          }
      }
      return null;
    }
    public Account findAccountById(String accountId){
        for(Account account : accounts){
            if(account.getAccId().equals(accountId)){
                return account;
            }
        }
        return  null;
    }
    public void showAllCustomers(){
        for(Customer customer : customers){
            System.out.println(customer);
        }
    }

    public void showAllAccounts(){
        for(Account account : accounts){
            System.out.println(account);
        }
    }



}
