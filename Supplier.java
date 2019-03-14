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
 * Meruapakan Constructor dari Object class Supplier
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
/**
* Method untuk mengembalikan data id Supplier
*
* @return mengembalikan data id Supplier
*/
    public int getId (){
        return id;
    }
/**
* Method untuk mengembalikan data nama Supplier
*
* @return mengembalikan data nama Supplier
*/
    public String getName(){
        return name;
    }
/**
* Method untuk mengembalikan data emailn Supplier
*
* @return mengembalikan data email Supplier
*/
    public String getEmail(){
        return email;
    }
/**
* Method untuk mengembalikan data Nomor Telepon Supplier
*
* @return mengembalikan data Nomor Telepon Supplier
*/
       public String getPhoneNumber(){
        return phoneNumber;
    }
/**
* Method untuk mengembalikan data Location
*
* @return mengembalikan data Location
*/    
    public Location getLocation (){
        return location;
    }
/**
* Method untuk mengubah data id Supplier
*
* @param id data id Supplier
*/    
    public void setId (int id){
        this.id = id;
    }
/**
* Method untuk mengubah data nama Supplier
*
* @param name data nama Supplier
*/
    public void setName(String name){
        this.name = name;
    }
/**
* Method untuk mengubah data Email Supplier
*
* @param Email data Email Supplier
*/
    public void setEmail (String email){
        this.email = email;
    }
/**
* Method untuk mengubah data Nomor Telepon Supplier
*
* @param phoneNumber data Nomor Telepon Supplier
*/
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
/**
* Method untuk mengubah data Location
*
* @param Location data Location
*/    
    public void setLocation (Location location){
        this.location = location;

    }
/**
* Method untuk menampilkan data yang dipanggil
*/    
    public void printData (){
        System.out.println ("----------SUPPLIER----------");
        System.out.println ("Name = "+name);
        System.out.println ("Email = "+email);
        System.out.println ("Nomer Telepon = "+phoneNumber);
        System.out.println ("Lokasi = "+location.getCity());
    }
}