 public class Buy_Paid extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
        
    public Buy_Paid(int id, Item item, String date, int totalItem,int totalPrice){
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