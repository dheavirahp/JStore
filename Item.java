package jstore;
/**
*Class Item digunakan untuk menentukan apa saja dan banyaknya Item yang
*tersedia di Jstore. Nantinya customer akan mendapatkan barang yang mereka
*butuhkan dengan melihat ketersediaan Item di Jstore.
*
*@author Dheavira Hadina Putri
*@version 1
*@since 28/01/2018
*/
public class Item
{
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, int price, ItemCategory category,
                ItemStatus status, Supplier supplier)
    {
        this.id = DatabaseItem.getLastItemID() + 1;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
        this.supplier = supplier;
    }

    /**
     * Method untuk mengembalikan id barang
     *
     * @return    id barang
     */
    public int getId()
    {
        return id;
    }

    /**
     * Method untuk mengembalikan nama barang
     *
     * @return    nama barang
     */
    public String getName()
    {
        return name;
    }

    /**
     * Method untuk mengembalikan harga barang
     *
     * @return    harga barang
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Method untuk mengembalikan kategori barang
     *
     * @return    kategori barang
     */
    public ItemCategory getCategory()
    {
        return category;
    }

    /**
     *
     *
     * @return
     */
    public ItemStatus getStatus()
    {
        return status;
    }

    /**
     * Method untuk mengembalikan supplier barang
     *
     * @return    objek supplier
     */
    public Supplier getSupplier()
    {
        return supplier;
    }

    /**
     * Method untuk mengubah id barang
     *
     * @param  id  id dari suatu barang
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Method untuk mengubah nama barang
     *
     * @param  name  nama dari suatu barang
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Method untuk mengubah harga barang
     *
     * @param  price  harga dari suatu barang
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * Method untuk mengubah kategori barang
     *
     * @param  category  kategori dari suatu barang
     */
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }

    /**
     *
     *
     * @param
     */
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }

    /**
     * Method untuk mengubah supplier barang
     *
     * @param  supplier  supplier dari suatu barang
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }

    /**
     * Method untuk menampilkan nama barang
     *
     */
    public String toString()
    {
        System.out.println("==========ITEM==========");
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Price:" + price);
        System.out.println("Category:" + category);
        System.out.println("Status:" + status);
        System.out.println("Supplier:" + supplier.getName());
        return "";
    }
}
