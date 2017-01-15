/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Course {
    private static List<CArraylist> clist=new ArrayList<>();
    private Scanner input=new Scanner(System.in); 
    public void Cmain(){
        
    
while(true){
        System.out.println("About Course:");
        System.out.println("1.Add ");
        System.out.println("2.Show all");
        System.out.println("3.Delete");
        
        System.out.println("Enter your choice [1-3]");
        int choice=input.nextInt();
        
        switch(choice){
            case 1:
                CArraylist ca=new CArraylist();
                System.out.println("Enter Student id");
                ca.setId(input.nextInt());
                System.out.println("Enter course name");
                ca.setCourse_name(input.next());
                System.out.println("Enter Price");
                ca.setPrice(input.next());
                System.out.println("Enter Duration of course");
                ca.setDuration(input.nextInt());
                System.out.println("Enter Duration type");
                ca.setDuration_type(input.next());
                clist.add(ca);
                break;
            case 2:
                
                for(CArraylist cal:clist){
                    System.out.println(cal.toString());
                }
                break;
            case 3:
                    
               
          System.out.println("Enter student id");
               int sid=input.nextInt();
                for(CArraylist cal: clist){
                if (sid == cal.getId()){
                    clist.remove(cal);
                    System.out.println("Sucessfilly Deleted");
                }
                    else{
                    System.out.println("Data not deleted");
                            }
                }
                break;
                
            default:
                
                break;
        }
}
    }
}
