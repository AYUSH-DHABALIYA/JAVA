// Rock, Paper, Scissor Game

#include <iostream>
#include <cstdlib>
using namespace std; // library file

class RPS_game // creating class
{
public:
//data member
     string name;
     int rounds;

     // member function
     void heading_name()
     {
          cout << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
          cout << endl
               << endl
               << "\t\tN A M E";
          cout << endl
               << endl
               << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
          cout << endl
               << endl
               << "Enter Your Name : ";
          cin >> name;
     }

//member function
     void heading_rounds()
     {
          cout << endl
               << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
          cout << endl
               << endl
               << "\t\tR O U N D S";
          cout << endl
               << endl
               << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
          cout << endl
               << endl
               << name << " How Many Rounds ou wnat to play? : ";
          cin >> rounds;
     }
};

class Game : public RPS_game // create new class with inheritence
{
public:
//data member of game class
     int i, user_score = 0, computer_score = 0, choice;

     // member function of game class
     int heading_game()
     {
          cout << endl
               << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
          cout << endl
               << endl
               << "\t\tG A M E";
          cout << endl
               << endl
               << "*--*--*--*--*--*--*--*--*--*--*--*--*--*";
     }

// member function of game class
     int main_game()
     {
          // for loop
          for (i = 1; i <= rounds; i++)
          {
               cout << endl
                    << endl
                    << "Round No : " << i << "/" << rounds;
               cout << endl
                    << endl
                    << "-* " << name << "'s Score = " << user_score;// printing user score
               cout << endl
                    << endl
                    << "-* Computer's Score = " << computer_score;// printing computer's score

               cout << endl
                    << endl
                    << "1) ROCK" << endl// printing choice you want to play
                    << endl
                    << "2) PAPER" << endl
                    << endl
                    << "3) SCISSOR" << endl
                    << endl
                    << "-> Select Your Choice : ";
               cin >> choice;

               int random = 1 + (rand() % 3);// getting random number from computer side

               cout << endl
                    << "-> Computer Choice : " << random;

               if (choice == random) // draw condition
               {
                    cout << endl
                         << endl
                         << "Draw";
               }
               else if (choice == 1 && random == 2 || choice == 1 && random == 3) // user winning condition
               {
                    cout << endl
                         << endl
                         << name << " Wins the Round";
                    user_score++;
               }
               else if (choice == 3 && random == 2)
               {
                    cout << endl
                         << endl
                         << name << " Wins the Round";
                    user_score++;
               }
               else if (random == 1 && choice == 2 || random == 1 && choice == 3)// computer's winning condition
               {
                    cout << endl
                         << endl
                         << "Computer Wins the Round";
                    computer_score++;
               }
               else if (random == 3 && choice == 2)
               {
                    cout << endl
                         << endl
                         << "Computer wins the Round";
                    computer_score++;
               }
               else if (random == 2 && choice == 1 || random == 2 && choice == 3)
               {
                    cout << endl
                         << endl
                         << name << " Wins the Round";
                    user_score++;
               }

               if (i >= rounds)// putting condition to get score
               {
                    if (user_score > computer_score)
                    {
                         cout << endl
                              << endl
                              << name << " Score : " << user_score;
                         cout << endl
                              << endl
                              << "computer Score : " << computer_score;
                         cout << endl
                              << endl
                              << name << " Wins the Game!";
                    }
                    else if (user_score == computer_score)
                    {
                         cout << endl
                              << endl
                              << name << " Score : " << user_score;
                         cout << endl
                              << endl
                              << "computer Score : " << computer_score;
                         cout << endl
                              << endl
                              << "Game is Draw!";
                    }
                    else
                    {
                         cout << endl
                              << endl
                              << name << " Score : " << user_score;
                         cout << endl
                              << endl
                              << "computer Score : " << computer_score;
                         cout << endl
                              << endl
                              << "Computer Wins the Game!";
                    }
               }
               else
               {
                    cout << endl
                         << endl
                         << "Press Enter to Continue...";
                    cin.ignore();
                    cin.get();// enter to play continue
               }
          }
     }
};

int main()  //main function
{
     Game rps; // object creation
     //calling member function
     rps.heading_name();
     rps.heading_rounds();
     rps.heading_game();
     rps.main_game();
}