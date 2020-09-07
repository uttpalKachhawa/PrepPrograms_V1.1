package concepts.oops;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 703238043 on Jul, 2020
 */
public class ClientOOPsConcept {
    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        System.out.println(map);
        Product product= new Product();
        //product is not an object its a reference variable which holds the hashcode of teh object
        //in hexadecimal

       /* System.out.println("product = " + product);
        product.setProductsDetails(1,"test",123);
        product.showProductDetails();*/

        Mobile m= new Mobile();
        m.setProductsDetails(2,"test1",55);
        m.showProductDetails();

        m.setProductsDetails(1,"test2",10,"mac",12,123);
        m.showProductDetails();
    }
}
