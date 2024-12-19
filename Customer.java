package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String CName;
    private String customerId;
    private int AccNumber;
    private String phone;
    List<Account> accountList;

    public Customer(String CName,String customerId, String phone) {
        this.CName = CName;
        this.customerId = customerId;
        this.phone = phone;
        accountList = new ArrayList<>();
    }
    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getAccNumber() {
        return AccNumber;
    }

    public void setAccNumber(int accNumber) {
        AccNumber = accNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public List<Account> getAccounts(){
        return  accountList;
    }

    public String toString(){
        return "Customer{" +
                "name='" + CName + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

}
