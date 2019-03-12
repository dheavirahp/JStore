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

    public int getId (){
        return id;
    }

    public Item getItem(){
        return item;
    }

    public String getDate(){
        return date;
    }

    public int getTotalPrice(){
        return totalPrice;
    }
    
    public void setId (int id){
        this.id = id;
    }

    public void setItem (Item item){
        this.item = item;
    }

    public void setDate (String date){
        this.date = date;
    }

    public void setTotalPrice (int totalPrice){
        this.totalPrice = totalPrice;
    }

    public void printData (){
        System.out.println ("ID = "+id);
        System.out.println ("Jumlah Barang = "+item);
        System.out.println ("Tanggal Pembelian = "+date);
        System.out.println ("Total Harga Barang = "+totalPrice);
        
    }
}