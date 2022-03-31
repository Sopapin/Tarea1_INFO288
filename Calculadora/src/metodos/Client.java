import java.rmi.Naming;
import java.util.Scanner;
import java.rmi.*;
import java.rmi.server.*;

public class Client {
    public static void main(String args[]) {
        try {
        	Scanner scan = new Scanner(System.in);
            System.out.print("Las operaciones son: sum, rest, mult, div, mod y pot: ");
            while(true){
	            String msg = scan.nextLine();
	            String[] argu = msg.split(" ");
	            String arg0 = argu[0]; 
	            
	            if(arg0.equals("EXIT")){
	                System.out.println("EXIT");
	                break;
	            } 
	            
	            String arg11 = argu[1]; 
	            String arg22 = argu[2];   
	            int arg1 = Integer.parseInt(arg11);
	            int arg2= Integer.parseInt(arg22);
	            
	            Calculator client = new CalculatorRemote();
	            
	            Calculator server = (Calculator)Naming.lookup("rmi://localhost:3000/test");
	            
	            if(arg0.equals("sum")){
	                System.out.println(client.sum(arg1,arg2));
	            }
	            else if(arg0.equals("rest")){
	                System.out.println(client.rest(arg1,arg2));
	            }
	            else if(arg0.equals("mult")){
	                System.out.println(client.mult(arg1,arg2));
	            }
	            else if(arg0.equals("div")){
	                System.out.println(client.div(arg1,arg2));
	            }
	            else if(arg0.equals("mod")){
	                System.out.println(client.mod(arg1,arg2));
	            }
	            else if(arg0.equals("pot")){
	                System.out.println(client.pot(arg1,arg2));
	            }
            }
            scan.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
