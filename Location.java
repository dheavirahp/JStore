import java.util.Scanner;
/**
*Class Location digunakan untuk melakukan pendataan untuk pembagian wilayah
*darimana Supplier berasal, nantinya class ini akan dipanggil kembali didalam
*Class Supplier untuk mencirikan darimana Supplier itu berasal.
*
* @author Dheavira Hadina Putri
* @version 1
* @since 28/01/2018
*/
public class Location{
    private String province;
    private String description;
    private String city;
/**
 *  Inisiasi fungsi-fungsi yang akan berjalan didalam Class Location
 * 
 * @param city penentuan lokasi dalam wilayah kota 
 * @param province penentuan lokasi dalam wilayah provinsi
 * @param description melakukan deskripsi lokasi dengan lebih detail
 */
    public Location(String city, String province, String description){
    this.city = city;
    this.province = province;
    this.description = description;
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