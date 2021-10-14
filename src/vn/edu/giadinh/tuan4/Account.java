package vn.edu.giadinh.tuan4;


public class Account {
    //attribute - thuộc tính - data
    int number_account;
    int number_blance;

    //method - function

    Account( int a , int b){
        number_account = a ;
        number_blance = b ;
    }

    void showData() {
        System.out.println("Account Number = " + number_account);
        System.out.println("Account Balance = " + number_blance );
    }

    void deposit ( int ammount){
        number_blance += ammount;
    }

    void withdraw(int ammount){
        number_account += ammount;
    }
    
}
