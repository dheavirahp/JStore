 public class Sell_Unpaid extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
        private String dueDate;
        
        
    public Sell_Unpaid(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod, String dueDate){
       super(id, item, date, totalItem, totalPrice);
       this.dueDate = dueDate;
    }
    public InvoiceStatus getInvoiceStatus (){
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }
    public String getDueDate (){
        return dueDate;
    }
     public void printData()
    {
        System.out.println("==========INVOICE DAN ID==========");
        System.out.println("Id: " + super.getId());
        System.out.println("tanggal: " + super.getDate());
        System.out.println("item: " + super.getTotalItem());
        System.out.println("total harga:  " + totalPrice);
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Type: " + getInvoiceType());
        System.out.println("Due Date: " +dueDate);
}
}