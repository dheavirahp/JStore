import java.util.Scanner;
/**
*Class Supplier digunakan untuk melakukan pendataan terhadap supplier yang
*bekerjasama dengan Jstore. Supplier ini dapat menyediakan beberapa Item yang
*nantinya akan dipanggil kembali fungsi ini didalam Class Item.
*
*@author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
*/
public class Supplier{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private static Location location;
/**
 * Inisiasi fungsi-fungsi yang akan berjalan didalam Class Supplier
 * 
 * @param id nomor ID untuk mewakili setiap Supplier 
 * @param name nama dari Supplier
 * @param email pendataan alamat email dari Supplier
 * @param phoneNumber digunakan untuk pendataan nomor telepon Supplier
 * @param Location pendataan lokasi darimana Supplier tersebut berasal
 */
    public Supplier(int id, String name, String email, String phoneNumber, Location location  ){
    this.id = id;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.location = location;
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