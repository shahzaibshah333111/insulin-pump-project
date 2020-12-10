
package insulin.pump.project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InsulinPumpProject {

    
    
      public static void main(String[] args) throws IOException {
 
DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
 
         
    try{
         
      
              String fileName= "Result1.doc";
              PrintWriter paper= new PrintWriter(fileName);
              paper.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            

            @Override
            public void run() {
                 LocalDateTime getcurrenttime = LocalDateTime.now();  
                 String datetime=DTF.format(getcurrenttime); 
                try {
                    Random r=new Random();
                    int start =5;
                    for(int loopcount=0;loopcount<=start;loopcount++){
                        int checkt=r.nextInt(5);
                        if( checkt>=0 && checkt<2){
                            System.out.println("The Patient need some sugar and to eat some Date");
                         
                        
                            paper.println("The Patient need some sugar and to eat some Date\n ::: "+checkt);
                            paper.println(datetime);
                            paper.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                            
                           
                          paper.flush();
                            break;
                            
                        }
                        else if( checkt>=3 &&  checkt<=5){
                            System.out.println(" The Patient sugar level is very high to inject insulin");
                         
                        
                            paper.println("Your Suger Level is  very High\n Your Suger Level is::: "+ checkt);
                             paper.println(datetime);
                            paper.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                           
                                paper.flush();
                                break;

                     }
                        else if( checkt==2){
                            System.out.println("The  Sugar Level  is Normal");
                         
                        
                            paper.println("Your Suger Level is normal\n Your Suger Level is: "+ checkt);
                             paper.println(datetime);
                            paper.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
                            
                             paper.flush();

                                break;

                            
                        }
                    }  
                    System.out.println("initial  time is  completed ");
                } catch (Exception ex) {
                    Logger.getLogger(InsulinPumpProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
       },
     new Date(),
        4500
        );  
    }  
       catch(Exception e){System.out.println(e);
           
           }  
}}


    
