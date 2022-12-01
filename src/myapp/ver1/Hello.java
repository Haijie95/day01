package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args){
        //javac -sourcepath src -d classes/ src/myapp/*.java src/myapp/ver1/*.java compiler path
        //Get system console
        Console cons=System.console();
        
        //Read from the console, the result is assigned to a variable
        String name=cons.readLine("What is your name? ");
        
        //Send a greeting to the name
        //System.out.println("Hello, "+name);
        if (name.trim().equals("Fred")){ 
            //== comparison is only for numbers
            //For string we use equals()
            //trim() removes the white spaces before and after the string
            System.out.println("Yaba Yaba Doo~~~\n");
        }else if(name.trim().equals("HJ")){
            System.out.printf("Hello %s, Welcome back!\n",name.trim().toUpperCase()); //To make all cap
        }else if (name.trim().equals("")){ //.isEmpty() or .length()==0
            System.err.println("Please Type Your name");
        }else {
        //printf allows formatting like in python %something
        System.out.printf("Hello %s. Nice to make your acquaintance!\n",name.trim().toLowerCase()); //To make all uncap
        }

        String age="";
        while(age.trim().length()<=0){
            age=cons.readLine("What is your age? ");
        }
    }
}
