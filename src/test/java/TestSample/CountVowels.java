package TestSample;
import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public static void performCounting(String str) {
        char ch;

int vowelsCount = 0;
int consonantCount = 0;
int othersCount = 0;

        str = str.toLowerCase();
     for (int i= 0; i<str.length();i++)

        {
            ch = str.charAt(i);
if (ch=='a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
    vowelsCount++;
else if (ch>= 'a' && ch<='z');
consonantCount++;
othersCount++;

        }
       System.out.println("Vowels : "+vowelsCount+ " " + "Consonants: "+consonantCount+"Others Characters : " +othersCount);
    }


    public static void main(String[] args) {

        System.out.println("Please enter a string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        performCounting(str);


    }
}
