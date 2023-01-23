/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lms1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Shenouda
 */
public class Readxml {

    /**
     *
     * @param args
     */
    public static void main2(String[] args) {
        File inputFileC= new File("coursedata.xml");
        if (inputFileC.exists()== false)
        {System.out.println("Sorry file is not exist");
        System.exit(0);}
        try{Scanner scc = new Scanner(inputFileC);
        while (scc.hasNext()){
            String dataC= scc.nextLine().replace("#",",");
            dataC= dataC.replace("$","\n");
            String[] newDataC= dataC.split("\n");
            String finalDataC="";
            System.out.println("Hello World!");
            /*for (int i=0;i<=newData.length;i++){
            if (i==0){finalData +=("id"+newData[i]);}
            else{finalData+=(i+" "+newData[i]);}}*/
            /*for (int i=0;i<=newData.length;i++){
            if (i==0){System.out.print("id"+newData[i]);}
            else{System.out.print(i+" "+newData[i]);}}
            System.out.println(sc.nextLine());*/
        System.out.println( dataC);}}
        catch(FileNotFoundException ex){
        System.out.println("File is not Exist");}
        catch (java.util.NoSuchElementException ex)
        {System.out.println("no more lines");}
        
    }
    
}
