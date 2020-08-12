package com.tata.module; 

  

import java.util.Scanner; 

  

public class class1 { 

  

    public static void main(String[] args) { 

         

         

         

         

        Scanner sc=new Scanner(System.in); 

        String src,desc; 

        Reservation r=new Reservation(); 

        r.display(); 

        System.out.println("Enter source and destination(TVM-BLR,COK-DEL,BOM-HYD,MAA-IXZ,JAI-GOI)"); 

        src=sc.next(); 

        desc=sc.next(); 

        try 

        { 

            if(src.equals("TVM")&&desc.equals("BLR")||src.equals("COK")&&desc.equals("DEL")||src.equals("BOM")&&desc.equals("HYD")||src.equals("MAA")&&desc.equals("IXZ")||src.equals("JAI")&&desc.equals("GOI")) 

         

        { 

        System.out.println("Enter the number of passengers"); 

        int no=sc.nextInt(); 

         

        System.out.println("Fare for adults=5000 "+ "Fare for children=2000"); 

         

        System.out.println("Flight Details "); 

        Flight f=new Flight(src ,desc,no); 

         

        f.check(src,desc); 

        Fare re=new Fare(src  ,desc,no); 

        re.fare(); 

         

        Stop s=new Stop(); 

        s.disp(); 

        s.details(); 

        } 

            else 

            {  

                throw new Exception(); 

                } 

    } 

        catch(Exception e) 

        { 

            System.out.println("Sorry for the inconvenience.Flights are available only for the given routes."); 

        } 

    } 

  

} 