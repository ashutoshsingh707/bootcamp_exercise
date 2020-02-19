public class AllStatic{
    static String firstName = "Ashutosh";
    static String lastName = "Singh";
    static int age = 21;

    static{
        System.out.println("\nWe are in static block");
        System.out.println("Name: Ashutosh Last Name: Singh Age: 21");
    }

    public static void printName(String fname, String lname, int age){
        System.out.println("We are in static method");
        System.out.println("Name: " + fname + " Last Name: "+ lname
        + " Age: "+age);
    }

    public static void main(String[] args){
        printName("Ashutosh", "Singh", 21);
        System.out.println("Using static Variable");

        System.out.println("Name: " + firstName + " Last Name: "+ lastName
        + " Age: "+age+"\n");
    }
}
