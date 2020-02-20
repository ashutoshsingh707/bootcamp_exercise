import java.util.*;
public class Ques_4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter string");
        String a= scan.nextLine();

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
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) /a.length() ;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) /a.length();
        double digitsPercentage = (digits * 100.0) /a.length();
        double otherCharPercentage = (others * 100.0) /a.length();
        System.out.println("number of uppercase "+a+ "= "+ upperCaseLetters);
        System.out.println("percentage of uppercase "+a+ "= "+ upperCaseLetterPercentage);
        System.out.println("number of lowercase "+a+ "= "+ lowerCaseLetters);
        System.out.println("percentage of lowercase "+a+ "= "+ lowerCaseLetterPercentage);
        System.out.println("number of digits "+a+ "= "+ digits);
        System.out.println("percentage of digits "+a+ "= "+ digitsPercentage);
        System.out.println("number of otherchar "+a+ "= "+ others);
        System.out.println("percentage of otherchar "+a+ "= "+ otherCharPercentage);

}
}



