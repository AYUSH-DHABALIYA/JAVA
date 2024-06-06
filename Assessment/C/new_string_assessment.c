#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int choice, len, i, freq = 0, space = 0, digit = 0, continue_choice, k = 1;
char str[50], str2[50], ch;
int Reverse()
{
    printf("\nEnter a string : ");
    scanf("%s", &str);
    strrev(str);
    printf("%s", str);
    return 0;
}
int Concatination()
{
    printf("\nEnter first string : ");
    scanf("%s", &str);
    printf("\nEnter second string : ");
    scanf("%s", &str2);
    strcat(str, str2);
    printf("%s", str);
    return 0;
}
int Palindrome()
{
    printf("\nEnter a string : ");
    scanf("%s", &str);
    strcpy(str2, str);
    strrev(str2);

    if (strcmp(str, str2) == 0)
    {
        printf("String is palindrome");
    }
    else
    {
        printf("String is not palindrome");
    }
    return 0;
}
int Copy()
{
    printf("\nEnter a string : ");
    scanf("%s", &str);
    strcpy(str2, str);
    printf("\nCopied String : %s", str2);
    return 0;
}
int Length()
{
    printf("\nEnter a String : ");
    scanf("%s", str);
    len = strlen(str);
    printf("\nLenght of String : %d", len);
    return 0;
}
int Frequency()
{
    printf("\nEnter a String : ");
    scanf("%s", &str);
    printf("\nEnter a charcater to find frequency of that charcter : ");
    scanf("%c", &ch);

    for (i = 0; str[i] != '\0'; i++)
    {
        if (ch == str[i])
        {
            freq++;
        }
    }

    printf("Frequency of %c : %d", ch, freq);
    return 0;
}
int vowel_consonent()
{
    printf("\nEnter a character : ");
    scanf(" %c", &ch);

    switch (ch)
    {
    case 'a':
    case 'A':
    case 'e':
    case 'E':
    case 'i':
    case 'I':
    case 'o':
    case 'O':
    case 'u':
    case 'U':
        printf("It's Vowel");
        break;

    default:
        printf("It's Consonant");
        break;
    }
    return 0;
}
int space_digit()
{
    char str[50];
    printf("\nEnter a string with space and digits : ");

    scanf("%s", &str);

    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] >= '0' && str[i] <= '9')
        {

            digit++;
        }
        if (str[i] == ' ')
        {
            space++;
        }
    }
    printf("\nspace : %d", space);
    printf("\nDigit : %d", digit);
    return 0;
}
int main()
{
    do
    {
        printf("\n1.Reverse a string\n2.Concat\n3.Palindrome\n4.Copy string\n5.Length of string\n6.Frequancy of character\n7.Vowel and consonant\n8.Space and digit");
        printf("\nEnter your choice :");
        scanf(" %d", &choice);
        switch (choice)
        {
        case 1:
            Reverse();
            break;
        case 2:
            Concatination();
            break;
        case 3:
            Palindrome();
            break;
        case 4:
            Copy();
            break;
        case 5:
            Length();
            break;
        case 6:
            Frequency();
            break;
        case 7:
            vowel_consonent();
            break;
        case 8:
            space_digit();
            break;

        default:
            printf("Invalid input");
            break;
        }
        printf("\nDo you want to continue:  ");
        scanf(" %d", &k);
    } while (k != 0);

    return 0;
}
