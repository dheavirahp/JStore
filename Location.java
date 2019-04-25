package jstore;
/**
*Class Location digunakan untuk melakukan pendataan untuk pembagian wilayah
*darimana Supplier berasal, nantinya class ini akan dipanggil kembali didalam
*
* @author Dheavira Hadina Putri
* @version 1
* @since 28/01/2018
*/

public class Location

{
    private String province;
    private String description;
    private String city;
    
 /**
 * Meruapakan Constructor dari Object class Location
 * Inisiasi fungsi-fungsi yang akan berjalan didalam Class Location
 * 
 * @param city penentuan lokasi dalam wilayah kota 
 * @param province penentuan lokasi dalam wilayah provinsi
 * @param description melakukan deskripsi lokasi dengan lebih detail
 */
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

/**
* Method untuk mengembalikan data nama provinsi
*
* @return mengembalikan data nama provinsi
*/
    public String getProvince()
    {
        return province;
    }

/**
* Method untuk mengembalikan data nama kota
*
* @return mengembalikan data nama kota
*/
    public String getCity()
    {
        return city;
    }
    
/**
* Method untuk mengembalikan data deskripsi alamat
*
* @return mengembalikan data deskripsi alamat
*/
    public String getDescription()
    {
        return description;
    }
    
/**
* Method untuk mengubah data nama provinsi
*
* @param province data nama provinsi
*/
  public void setProvince(String province)
    {
        this.province=province;
    }
    
/**
* Method untuk mengubah data nama kpota
*
* @param city data nama kota
*/   public void setCity(String city)
    {
        this.city=city;
    }
    
 /**
* Method untuk mengubah data deskripsi alamat
*
* @param description data deskripsi alamat
*/  public void setDescription(String description)
    {
        this.description=description;
    }
 
 /**
 *Method untuk menampilkan lokasi
 */   
    public String toString()
    {
        System.out.println("==========LOCATION==========");
        System.out.println("Province: " + province);
        System.out.println("City: " + city);
        System.out.println("Description: " + description);
        return "";
    }
    
}
