/**
*Description of Class Location here
*
*@author (Dheavira Hadina Putri)
*@version(28/01/2018)
*/
import java.util.Scanner;
public class Location{
    private String province;
    private String description;
    private String city;

    public Location(String city, String province, String description){
    }

    public String getProvince(){
        return province;
    }

    public String getCity(){
        return city;
    }

    public String getDescription(){
        return description;
    }

    public void setProvince(String province){
        this.province = province;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void printData (){
        System.out.println ("Kota = "+city);
        System.out.println ("Provinsi = "+province);
        System.out.println ("Deskripsi Alamat= "+description);
    }
}   