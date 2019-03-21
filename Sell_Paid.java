
    public class Sell_Paid extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
        
    public Sell_Paid(int id, Item item, String date, int totalPrice, int totalItem){
        super(id, item, date, totalItem, totalPrice);
  
    }
    
    public InvoiceStatus getInvoiceStatus (){
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType (){
        return INVOICE_TYPE;
    }
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("Id: " + super.getId());
        System.out.println("tanggal: " + super.getDate());
        System.out.println("item: " + super.getTotalItem());
        System.out.println("total harga:  " + totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Type: " + getInvoiceType());
    }
}