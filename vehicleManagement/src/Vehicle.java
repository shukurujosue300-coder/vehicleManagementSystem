import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vehicle{    
    int id;
    String name;
    String model;
    String plateNumber;
    int year;
    List<Vehicle> ls = new ArrayList();
    
    public Vehicle(int id, String name, String model, String plateNumber, int year) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.plateNumber = plateNumber;
        this.year = year;
    }

    
    Scanner sc = new Scanner(System.in);

    
     public int getId() {
        return id;
    }
 
    public void setId(int id) {
        System.out.print("Enter your id:");
        id=sc.nextInt();
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        System.out.print("setVehicleName:");
        name=sc.nextLine();
        this.name = name;
    }



    public String getModel() {

        return model;
    }



    public void setModel(String model) {
        System.out.print("setModel:");
        model=sc.nextLine();

        this.model = model;
    }



    public String getPlateNumber() {
        return plateNumber;
    }



    public void setPlateNumber(String plateNumber) {
        System.out.print("setPlateNumber: ");
        plateNumber=sc.nextLine();
        this.plateNumber = plateNumber;

    }



    public int getYear() {
        return year;
    }



    public void setYear(int year) {
        System.out.println("setYear: ");
        year = sc.nextInt();
        this.year = year;
    }






    public Vehicle() {

    }

  

    public void Save(){
         setId(id);
         sc.nextLine();
        setModel(model);
        setName(name);
        setPlateNumber(plateNumber);
        setYear(year);
        Vehicle v = new Vehicle(id,name,model,plateNumber,year);
        ls.add(v);
        
    }
      public void Display(){
         for (Vehicle v : ls)//for (int i = 0; i<ls.size();i++){}
            {
                System.out.println("Car Id:" + v.getId());
                System.out.println("Name:" + v.getName());
                System.out.println("type:" + v.getClass().getSimpleName());
                System.out.println("==========================================");
        }
    }

   
    
}
