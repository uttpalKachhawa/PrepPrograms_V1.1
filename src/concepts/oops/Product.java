package concepts.oops;

/**
 * @author 703238043 on Jul, 2020
 */
public class Product {
    //Attribute state
     int pid;
     String name;
     int price;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //constructor
    public Product() {
        System.out.println("from product object constructor");
    }

    //Methods
//method used to write data in product
    public void setProductsDetails(int pid, String name, int price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        //System.out.println("pid = " + pid);
    }

    public void showProductDetails() {
        System.out.println("---ProductID: " + pid + "------");
        System.out.println("---Name: " + name + "------");
        System.out.println("---Price: " + price + "------");
    }


}
class Mobile extends  Product
{

    String os;
    int ram;
    int sdCardSize;

    protected Mobile(){
        System.out.println("Mobile contructor called");
    }
    //redefined in child from parrent in diff inputs
    //method overloading
    public void setProductsDetails(int pid, String name, int price,String os,int ram,int sdCardSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.os=os;
        this.ram=ram;
        this.sdCardSize=sdCardSize;
        System.out.println("Data written in product object");
    }

    //this is method overriding
    public void showProductDetails() {
        System.out.println("---ProductID: " + pid + "------");
        System.out.println("---Name: " + name + "------");
        System.out.println("---Price: " + price + "------");
        System.out.println("---OS: " + os + "------");
        System.out.println("---Ram: " + ram + "------");
        System.out.println("---Sdcard: " + sdCardSize + "------");
    }


}