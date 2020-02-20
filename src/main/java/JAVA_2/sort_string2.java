package JAVA2.src.main.java;

public class sort_string2
{
    public static void main(String arg[])
    {
        String str="hello";
        int i,k,j;
        for(i=97;i<=122;i++)
        {
            for(j=0;j<str.length();j++)
            {
                char d=str.charAt(j);
                if(i==(int)d)
                {
                    System.out.println(d);
                }
            }
        }
    }
}
