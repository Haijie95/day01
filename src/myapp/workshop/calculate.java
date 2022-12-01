package myapp.workshop;

import java.io.Console;

public class calculate {
    public static void main(String[] args){
        
        Integer total=0;
        String input="";
        Integer count=0;

        Console cons=System.console();

        //dangerous infinite loop
        // while(true){   
        //     String input=cons.readLine("Enter a number: ");
        //     if(input.trim().equals("")){
        //         System.out.println("Please Enter a number! ");
        //     }else if (input.trim().toUpperCase().equals("STOP")){
        //         System.out.printf("The total is %s.\n",total);
        //         break;
        //     }else {
        //         try{
        //         int num=Integer.parseInt(input.trim());
        //         total=total+num;
        //         }catch (NumberFormatException e) {
        //             System.out.println("Invalid Number Input!!!");
        //         }
        //     }

        while(!input.equals("stop")){ // not equals to input "stop"
            //Read a line
            input=cons.readLine("Enter a number: ");
            input=input.trim();

            if (input.equals("stop")){
                break;
            }
            //total=total+value;
            total += Integer.parseInt(input);
            count += 1;
        }   
        
        System.out.printf("The total for %d numbers is %d",count,total);

        }
        

    }

