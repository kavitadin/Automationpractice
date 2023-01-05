//package TestSample;
//
//public class TestNumber {
//    public static void main(String[] args) {
//        int inputTerm = 571643;
//        System.out.println(isEquilibrium1(inputTerm));
//
//    }
//
//   // private static boolean findIfThirdTermIsFive(int j)
//
//
//    private static boolean isEquilibrium1(int i) {
//        String numberAsString = i + "";
//        int digitcount = numberAsString.length();
//        int splitsize = 0;
//        String num1Str = "";
//        String num2Str = "";
//        if (digitcount % 2 == 0) {
//            splitsize = digitcount / 2;
//            num1Str = numberAsString.substring(splitsize, digitcount);
//
//        } else {
//            splitsize = (digitcount - 1) / 2;
//            num2Str = numberAsString.substring(splitsize + 1, digitcount);
//        }
//
//        num1Str = numberAsString.substring(0, splitsize);
//        System.out.println("First half : " + num1Str + ": Second half" + num2Str + " Size: " + splitsize);
//        int sumlefthalf = 0;
//        int sumrighthalf = 0;
//        String n1[] = num1Str.split("");
//        String n2[] = num2Str.split("");
//
//        for (int j = 0; j < n1.length; j++) {
//            sumlefthalf += Integer.parseInt((n1[j]));
//        }
//        for (int j = 0; j < n2.length; j++) {
//            sumlefthalf += Integer.parseInt(n2[j]);
//        }
//        System.out.println("Sum first half :" + sumlefthalf + "Sum right half :" + sumrighthalf);
//        return sumlefthalf == sumrighthalf;
//    }
//
//    private static boolean isEquilibrium(int i) {
//
//    }
//}
//
//
//
//
