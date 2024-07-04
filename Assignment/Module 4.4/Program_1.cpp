// Assume a class cricketer is declared. Declare a derived class batsman from cricketer. Data member of batsman. Total runs, Average runs and best performance. Member functions input data, calculate average runs, Display data. (Single Inheritance)
#include<iostream>
using namespace std;
class cricketer// creating parent class 
{
public :
    string name, team;// creating data member
    int get_details(){
    cout << "Enter the name of batsman : ";
    cin >> name;
    cout <<endl<< "Enter the team of batsman : ";
    cin >> team;
    }
    
};

class batsman : public cricketer// creating child class 
{
public :
    int total_run, average_run, best_performance, total_match;
    int get_data(){// creating data function
        cout << "\nEnter the total runs of batsman : ";
        cin >> total_run;
        cout << "\nEnter the total matches of batsman : ";
        cin >> total_match;
        cout << "\nEnter the highest score of batsman : ";
        cin >> best_performance;    
    }

    int average(){
        average_run = total_run / total_match;
    }

    int show()
    {
        cout << "\nThe name of batsman is " << name;
        cout << "\nThe team of batsman is " << team;
        cout << "\nThe total runs of batsman is " << total_run;
        cout << "\nThe highest score of batsman is " << best_performance;
        cout << "\nThe average run of batsman is " << average_run;
    }
};

int main(){
    batsman obj;// creating object
    obj.get_details();//calling function
    obj.get_data();
    obj.average();
    obj.show();
    return 0;
}