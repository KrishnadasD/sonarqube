package com.tata.module; 

  

import java.util.ArrayList; 

import java.util.HashMap; 

import java.util.Iterator; 

import java.util.LinkedList; 

import java.util.List; 

import java.util.ListIterator; 

import java.util.Map; 

import java.util.Scanner; 

  

public interface class2 { 

    void display(); 

} 

abstract class Info{ 

    abstract void details(); 

} 

class Reservation implements class2{ 

     

    private String source; 

     

    Reservation(){} 

    public Reservation(String source, String dest, int nop) { 

        super(); 

        this.source = source; 

        this.dest = dest; 

        this.nop = nop; 

    } 

    private String dest; 

    private int nop; 

     

    int getNop() { 

        return nop; 

    } 

    void setNop(int nop) { 

        this.nop = nop; 

    } 

    String getSource() { 

        return source; 

    } 

    void setSource(String source) { 

        this.source = source; 

    } 

    String getDest() { 

        return dest; 

    } 

    void setDest(String dest) { 

        this.dest = dest; 

    } 

     

     

    public void display() { 

         

     System.out.println("-----------------------Welcome to ABC Airlines-----------------------"); 

    } 

         

         

         

    } 

  

class Flight extends Reservation{ 

     

     

    public Flight(String source, String dest, int nop) { 

        super(source, dest, nop); 

         

    } 

  

    void check(String s,String d)  

    { 

         

        Map<String,List<String>> h=new HashMap<String,List<String>>(); 

        List<String> val1=new LinkedList<String>(); 

        val1.add("TVM"); 

        val1.add("BLR"); 

        val1.add("DEP: 15 00"); 

        val1.add("ARR: 16 15"); 

        h.put("INDIGO", val1); 

        List<String> val2=new LinkedList<String>(); 

        val2.add("COK"); 

        val2.add("DEL"); 

        val2.add("DEP: 06 00"); 

        val2.add("ARR: 09 05"); 

        h.put("JET AIRWAYS", val2); 

         

        List<String> val3=new LinkedList<String>(); 

        val3.add("BOM"); 

        val3.add("HYD"); 

        val3.add("DEP: 10 00"); 

        val3.add("ARR: 11 35"); 

        h.put("AIR INDIA", val3); 

         

        List<String> val4=new LinkedList<String>(); 

        val4.add("MAA"); 

        val4.add("IXZ"); 

        val4.add("DEP: 14 00"); 

        val4.add("ARR: 16 25"); 

        h.put("SPICEJET", val4); 

         

        List<String> val5=new LinkedList<String>(); 

        val5.add("JAI"); 

        val5.add("GOI"); 

        val5.add("DEP: 19 00"); 

        val5.add("ARR: 23 35"); 

        h.put("VISTARA", val5); 

     

  

        

           for (Map.Entry<String,List<String>> entry : h.entrySet())  

           { 

               

                Iterator list_Iter=(entry.getValue()).iterator();  

                while(list_Iter.hasNext()) { 

                     

                    if(s.equals(list_Iter.next()) && ( d.equals(list_Iter.next()))) 

                            { 

                     

                         System.out.println(entry.getKey());  

                                System.out.println(h.get(entry.getKey()));                         

                               } 

  

                } 

           }    

    } 

     

} 

class Passenger{ 

  

    private String pName; 

    private int pAge; 

    private int pIdno; 

    Passenger(){ 

         

    } 

    int[] get(int n) { 

        Scanner s=new Scanner(System.in); 

        int age[]=new int[n]; 

        for(int i=0;i<n;i++) 

        { 

        System.out.println("\nEnter the NAME"); 

        pName=s.next(); 

        System.out.println("Enter your AGE"); 

        pAge=s.nextInt(); 

        age[i]=pAge; 

        System.out.println("Enter your Idno"); 

        pIdno=s.nextInt(); 

         

        } 

        return age; 

         

    } 

     

} 

     

  

class Fare extends Reservation{ 

    public Fare(String source, String dest, int nop) { 

        super(source, dest, nop); 

         

    } 

     

    Passenger p1=new Passenger(); 

    int cashA=5000; 

    int cashC=2000; 

    void fare() { 

        int n=getNop(); 

        int sum=0; 

        int a[]=new int[n]; 

         

        a=p1.get(n); 

        for(int i=0;i<n;i++) 

        { 

            if(a[i]<10) { 

                sum=sum+cashC; 

            } 

            else 

            { 

                sum=sum+cashA; 

            } 

                 

        } 

         

             

             

         

        System.out.println("The Total fare ="+sum); 

    } 

     

     

     

} 

  

final class Stop extends Info 

{ 

     

    void disp() 

    { 

        System.out.println("Thank you for booking with us!"); 

    } 

    void details() { 

        System.out.println("For any queries contact:987656789 or mail us at abcairlines@abc.com"); 

    } 

} 

 