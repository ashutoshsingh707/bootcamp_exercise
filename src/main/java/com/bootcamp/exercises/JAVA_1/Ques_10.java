import java.util.Scanner;
public class Ques_10 {
  
    public int add(int x, int y) 
    { 
        return (x + y); 
    } 
  
    public double add(double x, double y) 
    { 
        return (x + y); 
    } 

    public int mul(int x, int y) 
    { 
        return (x * y); 
    } 

    public double mul(double x, double y) 
    { 
        return (x * y); 
    } 

    public String concat(String x, String y) 
    { 
        return (x + y); 
    } 
  
    public String concat(String x, String y, String z) 
    { 
        return (x + y + z); 
    } 

    public static void main(String args[]) 
    { 
        Ques_10 a = new Ques_10();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter x");
        int x = scan.nextInt();
        System.out.println("Enter y");
        int y = scan.nextInt();
        System.out.println("Enter z");
        int z = scan.nextInt();
        System.out.println(a.add(x, y));
        System.out.println(a.add(x,y));
        System.out.println(a.mul(x, y));
        System.out.println(a.mul(x, y));
        System.out.println(a.concat("Ashutosh", " Singh"));
        System.out.println(a.concat("Ashutosh", " 98", " Singh"));
    } 
} 
