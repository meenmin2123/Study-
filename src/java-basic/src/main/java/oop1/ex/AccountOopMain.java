package oop1.ex;

public class AccountOopMain {
    public static void main(String[] args) {

     Account account = new Account();
     System.out.println("잔고 거래 전 : " + account.balance);

     account.deposit(100);
     account.withdraw(100);
     account.withdraw(500);

     System.out.println("잔고 : " + account.balance);


    }
}
