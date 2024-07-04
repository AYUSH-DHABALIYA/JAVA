// Define a class to represent a bank account. Include the following members:
#include<iostream>
using namespace std;
class bank // creating bank class 
{
public : // public keyword is used for access of class for everyone
     string holder_name,account_type; //creating data members
    int account_number, account_balance = 0, deposit, withdraw;

    void get(){ // creating different functions for getting bank details from user
    cout << "Enter the name :";
    cin >> holder_name;
    cout << endl << "Enter account type :";
    cin >> account_type;
    cout << endl << "Enter account number :";
    cin >> account_number;
    cout << endl << "Enter account balance :";
    cin >> account_balance;
}
    int depositor()
    {   
        
        cout << endl << "Enter the amount want to deposit :";
        cin >> deposit;
        account_balance = deposit + account_balance;
        cout << "The account balance is : "<< account_balance;
    }
    int withdrawer()
    {
        cout << endl << "Enter amount you want withdraw : ";
        cin >> withdraw;
        account_balance = account_balance - withdraw;
        if(withdraw > account_balance){

        cout << "Please enter proper amount " << endl;
        }
          
        
        else { 
         account_balance = account_balance - withdraw;
        cout << "Total amount in balance is :" << account_balance;
        return 0;}
            
    }
    int show()
    {
        cout <<"Account holder name is "<< holder_name;
        cout << endl << "Your account type is " << account_type;
        cout << endl << "Your account balance is " << account_balance;
    }
};
int main()
{ 
    bank obj; // creating main function and create object for access 
    int choice;
    obj.get();

    cout << "\n1.Deposit\n2.Withdraw\n3.Check details ";
    cout << endl << "Enter your choice : ";
    cin >> choice;

    switch (choice) // using switch case for user choice
    {
    case 1:
        obj.depositor();
        break;
    case 2:
        obj.withdrawer();
        break;
    case 3:
        obj.show();
        break;
    
    default:
        cout << "Error";
        break;
    }

  
}