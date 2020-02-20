
package com.LibraryManagement;
import java.util.Scanner;
class Library extends Abstract
{
    public String Library_Name;
    public int Library_id;

    @Override
    void setDetails()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Library_Name");
        String Library_Name = scan.nextLine();
        System.out.println("Library_id");
        String Library_id = scan.nextLine();
       // Library_Name="TIKAK LIBRARY";
        //Library_id=124542;
    }

    @Override
    void getDetails()
    {
        System.out.println(Library_Name);
        System.out.println(Library_id);
    }
}
class Librarian implements Lib1
{
    public String Librarian_Name;
    public int Librarian_id;
    public String Librarian_address;


    public void setDetail() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Librarian_Name");
        String Librarian_Name = scan.nextLine();
        System.out.println("Librarian_id");
        String Librarian_id = scan.nextLine();
        System.out.println("Librarian_address");
        String Librarian_address = scan.nextLine();
        // Librarian_Name="Ajay";
       // Librarian_id=1234;
      //  Librarian_address="xyz street  abc nagar";

    }

    public void getDetail() {
        System.out.println(Librarian_Name);
        System.out.println(Librarian_id);
        System.out.println(Librarian_address);

    }
}
class user extends Abstract
{
    public String user_name;
    public int user_id;
    public String user_address;
    @Override
    public void setDetails() {
        Scanner scan=new Scanner(System.in);
        System.out.println("user_Name");
        String user_name = scan.nextLine();
        System.out.println("user_id");
        String user_id = scan.nextLine();
        System.out.println("user_address");
        String user_address = scan.nextLine();
       /* user_name="Ajay Kumar";
        user_id=1234565;
        user_address="xyz street  abc nagar Delhi";*/

    }
    @Override
    public void getDetails() {
        System.out.println(user_name);
        System.out.println(user_id);
        System.out.println(user_address);

    }
}
class Book implements Lib1
{
    public String Book_Name;
    public String Book_Author;
    public int Book_Id;

    public void setDetail() {
        Book_Name="Programming with C";
        Book_Author="K.N Korth";
        Book_Id=9869;

    }

    public void getDetail() {
        System.out.println(Book_Name);
        System.out.println(Book_Id);
        System.out.println(Book_Author);

    }
}
class Library_Management
{
    public static void main(String arg[])
    {
        Library l=new Library();
        Librarian ll=new Librarian();
        user u=new user();
        Book b=new Book();
        System.out.println("***LIBRARY****");
        l.setDetails();
        l.getDetails();
        System.out.println("*****LIBRARIAN*****");
        ll.setDetail();
        ll.getDetail();
        System.out.println("*****USER****");
        u.setDetails();
        u.getDetails();
        System.out.println("****BOOK***");
        b.setDetail();
        b.getDetail();
    }
}
