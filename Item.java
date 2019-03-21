import java.util.Scanner;
/**
*Class Item digunakan untuk menentukan apa saja dan banyaknya Item yang
*tersedia di Jstore. Nantinya customer akan mendapatkan barang yang mereka
*butuhkan dengan melihat ketersediaan Item di Jstore.
*
*@author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
*/
public class Item{
    private int id;
    private String name;
    private int stock;
    private int price;
    private static ItemCategory category;
    private static ItemStatus status;
    private static Supplier supplier;
/**
 * 
 * Meruapakan Constructor dari Object class Item
 * Inisiasi fungsi-fungsi yang akan berjalan didalam Class Item
 * 
 * @param id nomor ID untuk mewakili setiap Item 
 * @param name nama dari Item
 * @param stock banyaknya Item yang masih tersedia didalam Jstore
 * @param price harga Item persatuan
 * @param category kategori Item yang disimpan
 * @param supplier data supplier yang memasok Item tersebut
 */
    public Item(int id, String name, int stock, int price, ItemStatus status, ItemCategory category, Supplier supplier){
    this.id = id;
    this.name = name;
    this.stock = stock;
    this.price = price;
    this.category = category;
    this.supplier = supplier;
    this.status = status;
    
}
/**
* Method untuk mengembalikan data id barang
*
* @return mengembalikan data id barang
*/
    public int getId (){
        return id;
    }
/**
* Method untuk mengembalikan data nama barang
*
* @return mengembalikan data nama barang
*/
    public String getName(){
        return name;
    }
/**
* Method untuk mengembalikan data jumlah ketersediaan barang
*
* @return mengembalikan data jumlah ketersediaan barang
*/
    public int getStock(){
        return stock;
    }
/**
* Method untuk mengembalikan data harga barang
*
* @return mengembalikan data harga barang
*/
    public int getPrice(){
        return price;
    }
/**
* Method untuk mengembalikan data kategori barang
*
* @return mengembalikan data kategori barang
*/

    public ItemCategory getCategory (){
      return category;  
    }
/**
* Method untuk mengembalikan data supplier
*
* @return mengembalikan data supplier
*/    
    public Supplier getSupplier (){
        return supplier;
    }

    
    public ItemStatus getStatus (){
        return status;
    }

/**
* Method untuk mengubah data id barang
*
* @param id data id barang
*/
    public void setId (int id){
        this.id = id;
    }
/**
* Method untuk mengubah data nama barang
*
* @param name data nama barang
*/
    public void setName(String name){
        this.name = name;
    }
/**
* Method untuk mengubah data jumlah ketersediaan barang
*
* @param stock data jumlah ketersediaan barang
*/
    public void setStock (int stock){
        this.stock = stock;
    }
/**
* Method untuk mengubah data harga barang
*
* @param price data harga barang
*/
    public void setPrice (int price){
        this.price = price;
    }
/**
* Method untuk mengubah data kategori barang
*
* @param category data kategori barang
*/

    public void setCategory (ItemCategory category){
                this.category = category;

    }
/**
* Method untuk mengubah data supplier
*
* @param supplier data supplier
*/
    public void setSupplier (Supplier supplier){
        this.supplier = supplier;

    }

    
    public void setStatus (ItemStatus status){
        this.status = status;
    }

/**
* Method untuk menampilkan data yang dipanggil
*/    
    public void printData (){
        System.out.println ("----------ITEM----------");
        System.out.println ("ID = "+id);
        System.out.println ("Name = "+name);
        System.out.println ("Stock = "+stock);
        System.out.println ("Category = "+category);
        System.out.println ("Status = "+status);
        System.out.println ("Supplier = "+supplier.getName());
    }

}