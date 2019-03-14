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
    private int totalItem;
    private int totalPrice;
    private InvoiceStatus status;

/**
 *Meruapakan Constructor dari Object class Invoice
 *Inisiasi fungsi-fungsi yang akan berjalan didalam Class Invoice
 * 
 * @param id nomor ID untuk mewakili setiap Item 
 * @param item untuk menentukan item yang dipilih
 * @param date untuk menentukan waktu invoice dibuat (dimasukkan oleh user)
 * @param totalPrice digunakan untuk melakukan penjumlahan seluruh harga Item yang dipilih
 */
    public Invoice(int id, Item item, InvoiceStatus status, String date, int totalPrice, int totalItem ){
    this.id  =id;
    this.item = item;
    this.date = date;
    this.totalPrice = totalPrice;
    this.totalItem = totalItem;
    this.status = status;

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
    public int getTotalItem(){
        return totalPrice;
    }
    public InvoiceStatus getInvoiceStatus(){
        return status;
    }
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
    public void setTotalItem (int totalItem){
        this.totalItem = totalItem;
    }
    public void setInvoiceStatus (InvoiceStatus status){
        this.status = status;
    }
/**
* Method untuk menampilkan data yang dipanggil
*/
    public void printData (){
        System.out.println ("----------INVOICE----------");
        System.out.println ("ID = "+id);
        System.out.println ("Date = "+date);
        System.out.println ("Item = "+item.getName());
        System.out.println ("Total Item = "+totalItem);
        System.out.println ("Total Harga Barang = "+totalPrice);
        System.out.println ("Status = "+status);
        
    }
}