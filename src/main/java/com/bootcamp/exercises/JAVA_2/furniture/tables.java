package com.bootcamp.exercises.JAVA_2.furniture;

class MetalTables extends table
{
    {
        Type = "metal table";
        StressProof_= "true";
        FireProof = "true";
    }
    void getDetails()
    {
        System.out.println(Type);
        System.out.println("Stress Proof: "+StressProof_);
        System.out.println("Fire Proof: "+FireProof);
    }
}
class WoodenTables extends table {
    {
        Type = "wooden table";
        StressProof_ = "true";
        FireProof = "Nooo";
    }
    void getDetails()
    {
        System.out.println(Type);
        System.out.println("Stress Proof: "+StressProof_);
        System.out.println("Fire Proof: "+FireProof);
    }
}
class tables
{
    public static void main(String args[])
    {
        System.out.println("****METAL TABLE DETAIL*********");
        MetalTables m=new MetalTables();
        m.getDetails();
        System.out.println("****WOODEN TABLE DETAIL*********");
        WoodenTables w=new WoodenTables();
        w.getDetails();
    }
}
