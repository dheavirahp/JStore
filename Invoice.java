/**
*Description of Class Invoice here
*
*@author (Dheavira Hadina Putri)
*@version(28/01/2018)
*/
import java.util.Scanner;
public class Invoice{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;


    public Invoice(){
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