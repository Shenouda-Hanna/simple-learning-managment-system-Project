/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lms1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shenouda
 */
public class LMS1 {

    public static void main(String[] args) {
        File inputFile= new File("student-data.txt");
        if (inputFile.exists()== false)
        {System.out.println("Sorry file is not exist");
        System.exit(0);}
        try{Scanner sc = new Scanner(inputFile);
        while (sc.hasNext()){
            String data= sc.nextLine().replace("#",",");
            data= data.replace("$","\n");
            String[] newData= data.split("\n");
            String finalData="";
      /**/
        System.out.println( data);}}
        catch(FileNotFoundException ex){
        System.out.println("File is not Exist");}
        catch (java.util.NoSuchElementException ex)
        {System.out.println("no more lines");}
        System.out.println("Hello World!");
        
        
             //xml courses data
    File inputFileC= new File("coursedata.xml");
    if (inputFileC.exists()== false)
    {System.out.println("Sorry file is not exist");
    System.exit(0);}
        try {
            Scanner scc = new Scanner(inputFileC);
            while (scc.hasNext()){
            String dataC;
                dataC = scc.nextLine();
                String[] newDataC= dataC.split("<id>");
                String finalDataC="";
                dataC= dataC.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>","");
                dataC= dataC.replace("<id>","");
                dataC= dataC.replace("<Instructor>","");
                dataC= dataC.replace("</Instructor>",",");
                dataC= dataC.replace("<CourseDuration>","");
                dataC= dataC.replace("</CourseDuration>",",");
                dataC= dataC.replace("<CourseTime>","");
                dataC= dataC.replace("</CourseTime>",",");
                dataC= dataC.replace("<Location>","");
                dataC= dataC.replace("</Location>",",");
                dataC= dataC.replace("</id>\n" +"\n" +"<CourseName>",",");
                dataC= dataC.replace("-<root>","");
                dataC= dataC.replace("</root>","");
                dataC= dataC.replace("<row>","");
                dataC= dataC.replace("</row>","");
                dataC= dataC.replace("</CourseName>",",");
                System.out.println( dataC);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LMS1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}    


