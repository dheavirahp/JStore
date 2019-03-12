import java.util.Scanner;
/**
*Class Invoice berfungsi sebagai tanda bukti transaksi dengan memperlihatkan
*fungsi dari Class Item dengan rincian total harga dari seluruh item yang
*dibeli beserta tanggal pembelian.
*
*@author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
*/
public class Invoice{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

/**
 *Meruapakan Constructor dari Object class Invoice
 *Inisiasi fungsi-fungsi yang akan berjalan didalam Class Invoice
 * 
 * @param id nomor ID untuk mewakili setiap Item 
 * @param item untuk menentukan item yang dipilih
 * @param date untuk menentukan waktu invoice dibuat (dimasukkan oleh user)
 * @param totalPrice digunakan untuk melakukan penjumlahan seluruh harga Item yang dipilih
 */
    public Invoice(int id, Item item, String date, int totalPrice ){
    this.id  =id;
    this.item = item;
    this.date = date;
    this.totalPrice = totalPrice;
    }
/**
* Method untuk mengembalikan data id pembelian
*
* @return mengembalikan data id pembelian
*/
    public int getId (){
        return id;
    }
/**
* Method untuk mengembalikan data item pembelian
*
* @return mengembalikan data item pembelian
*/
    public Item getItem(){
        return item;
    }
/**
* Method untuk mengembalikan data tanggal pembelian
*
* @return mengembalikan data tanggal pembelian
*/
    public String getDate(){
        return date;
    }
/**
* Method untuk mengembalikan data total harga pembelian
*
* @return mengembalikan data total harga pembelian
*/
    public int getTotalPrice(){
        return totalPrice;
    }
/**
* Method untuk mengubah data id pembelian
*
* @param id data id pembelian
*/    
    public void setId (int id){
        this.id = id;
    }
/**
* Method untuk mengubah data item pembelian
*
* @param item data item pembelian
*/
    public void setItem (Item item){
        this.item = item;
    }
/**
* Method untuk mengubah data tanggal pembelian
*
* @param date data tanggal pembelian
*/
    public void setDate (String date){
        this.date = date;
    }
/**
* Method untuk mengubah data harga pembelian
*
* @param totalPrice data total harga pembelian
*/
    public void setTotalPrice (int totalPrice){
        this.totalPrice = totalPrice;
    }
/**
* Method untuk menampilkan data yang dipanggil
*/
    public void printData (){
        System.out.println ("ID = "+id);
        System.out.println ("Jumlah Barang = "+item);
        System.out.println ("Tanggal Pembelian = "+date);
        System.out.println ("Total Harga Barang = "+totalPrice);
        
    }
}