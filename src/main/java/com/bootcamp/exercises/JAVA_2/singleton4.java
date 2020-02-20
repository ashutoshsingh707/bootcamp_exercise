package JAVA_2;

public class singleton4
{
    static singleton4 s=null;
    String str;
    private singleton4()
    {
        str="the quick brown fox jump over a lazy dog";
    }
    public static singleton4 getInstance()
    {
        if(s==null)
        {
           s=new singleton4();
        }
        return s;
    }
    public static void main(String arg[])
    {
        singleton4 x= singleton4.getInstance();
        singleton4 y= singleton4.getInstance();
        singleton4 z= singleton4.getInstance();
        x.str=(x.str).toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        y.str=(x.str).toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
}
