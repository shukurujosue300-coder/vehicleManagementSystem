
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to vehicle management system :");
        
        Bus bus = new Bus();
        Vehicle truck = new Truck();
        Scanner sc = new Scanner(System.in);
       
        while(true){
            System.out.println("select 1:register Truck");
            System.out.println("select 2:display registered vehicle");
            System.out.print("Enter your choice: ");
             int choice = sc.nextInt();
            switch (choice) {
                case 1:bus.Save();
                    
                    break;
                case 2:bus.Display();
                    break;
                case 3: 
                System.out.println("thank you for your participation, GOod byee!!!!!");
                return;
                default:
                    throw new AssertionError();
                    
            }
               
      
        
       
            
        }
     

         
    }
}
