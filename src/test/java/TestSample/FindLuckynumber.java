package TestSample;

 import  java.util.Scanner;

 //import static sun.security.util.Debug.args;

public class FindLuckynumber {

    private static int j;
    private static int i;

    public static void main(String[] args) {
        
    }
    public static void FindLuckynumber(int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= n; i++) {

            sb.append(i + ",");
        }
        System.out.println(sb.toString());
        int removePosition = 2;
        String elementsArr[] = sb.toString().split(",");
        while (removePosition < elementsArr.length) {
            sb = new StringBuffer();
            for (int i = 0, j = 1; i < elementsArr.length; i++, j++) ;
            {
                if (j == removePosition)
                    j = 0;
                else
                    sb.append(elementsArr[i] + ",");
            }
            System.out.println(sb.toString());
            elementsArr = sb.toString().split(",");
            removePosition++;



           // public static void main(String[]args){
                System.out.println("Please enter a number:");
                Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
                if (n < 1)
                    System.out.println("please enter a valid number...");
                else {
                    FindLuckynumber(n);
                }

            }
        }
    }



