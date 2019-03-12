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
    private String category;
    private static Supplier supplier;
/**
 * Inisiasi fungsi-fungsi yang akan berjalan didalam Class Item
 * 
 * @param id nomor ID untuk mewakili setiap Item 
 * @param name nama dari Item
 * @param stock banyaknya Item yang masih tersedia didalam Jstore
 * @param price harga Item persatuan
 * @param category kategori Item yang disimpan
 * @param supplier data supplier yang memasok Item tersebut
 */
    public Item(int id, String name, int stock, int price, String category, Supplier supplier){
    this.id = id;
    this.name = name;
    this.stock = stock;
    this.price = price;
    this.category = category;
    this.supplier = supplier;
    
}

    public int getId (){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getStock(){
        return stock;
    }

    public int getPrice(){
        return price;
    }

    public String getCategory (){
        return category;
    }
    
    public Supplier getSupplier (){
        return supplier;
    }
    /**
     * description function
     * @param id
     */
    public void setId (int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStock (int stock){
        this.stock = stock;
    }

    public void setPrice (int price){
        this.price = price;
    }

    public void setCategory (String category){
        this.category = category;
    }

    public void setSupplier (Supplier supplier){
        this.supplier = supplier;

    }
    
    public void printData (){
        System.out.println ("ID = "+id);
        System.out.println ("Name = "+name);
        System.out.println ("Price = "+price);
        System.out.println ("Category = "+category);
    }

}