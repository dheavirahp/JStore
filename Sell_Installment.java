public class Sell_Installment extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
        private int installmentPeriod;
        private int installmentPrice;
        
        
    public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod){
        super(id, item, date, totalItem, totalPrice);
        this.installmentPeriod = installmentPeriod;
      
    }
    
    public int getInstallmentPeriod (){
        return installmentPeriod;
    }
    public int getInstallmentPrice (){
        return installmentPrice;
    }
    public InvoiceStatus getInvoiceStatus (){
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType (){
        return INVOICE_TYPE;
    }
    public void setInstallmentPrice (){
        double installmentPrice = (totalPrice/installmentPeriod) * 1.02;
        this.installmentPrice = (int) installmentPrice;
    }
    public void setTotalPrice(){
        this.totalPrice = totalPrice;
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
        System.out.println("Installment Price: " + getInstallmentPrice());
    }
    
}
