import java.util.*;
public class Solution{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a="ashutoh@HJK";
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i<a.length(); i++) 
        {
            char ch = a.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }
             
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            else
            {
                others++;
            }
        }
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) /12 ;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) /12;
        double digitsPercentage = (digits * 100.0) /12;
        double otherCharPercentage = (others * 100.0) /12;
        System.out.println("number of uppercase "+a+ "= "+ upperCaseLetters);
        System.out.println("percentage of uppercase "+a+ "= "+ upperCaseLetterPercentage);
}
}



