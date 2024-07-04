//WAP of vowel and consonant using switch case//
#include<stdio.h>
void main()
{
    char ch;
    printf("Enter character :");
    scanf("%c",&ch);//get character from user//

    switch (ch)
    {
    case 'a'://creating case of vowel,upper case and lower case //
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
      printf("%c is vowel.\n",ch);
        break;
    
    default:
      printf("%c is consonant.\n",ch);// print consonants not count in vowels//
        break;
    }
}