/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mdeboer1
 */
public class FilePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File data = new File("C:" + File.separatorChar + "temp" + File.separatorChar +
                "lab1.txt");
        
        BufferedReader read = null;
        
        try {
            read = new BufferedReader(new FileReader(data));
            String line = "";
            while (line != null){
                line = read.readLine();
//                System.out.println(line);
                int lineNumber = 1;
                if (lineNumber == 1){
                    String[] formatter = line.split(" ");
                    System.out.println("Last Name: " + formatter[1]);
                    System.out.println("First Name: " + formatter[0]);
                    lineNumber++;
                }
                if (lineNumber == 2){
                    line = read.readLine();
                    System.out.println("Address: " + line);
                    lineNumber++;
                }
                if (lineNumber == 3){
                    line = read.readLine();
                    System.out.println("City, State, Zip: " + line);
                    
                }
                line = read.readLine();
                if (line != null){
                    System.out.println(line);
                }
                lineNumber = 1;
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
            System.out.println("Error");
        }
        finally{
            try{
               read.close(); 
            }catch(Exception e){
                
            }
            
        }
    }
    
}
