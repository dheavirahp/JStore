/**
*Description of Class Supplier here
*
*@author (Dheavira Hadina Putri)
*@version(28/01/2018)
*/
import java.util.Scanner;
public class Supplier{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private static Location location;

    public Supplier(int id, String name, String email, String phoneNumber, Location location  ){
    }

    public int getId (){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

       public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Location getLocation (){
        return location;
    }
    
    public void setId (int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation (Location location){
        this.location = location;

    }
    
    public void printData (){
                System.out.println ("ID = "+id);
        System.out.println ("Name = "+name);
        System.out.println ("Nomer Telepon = "+phoneNumber);
    }
}