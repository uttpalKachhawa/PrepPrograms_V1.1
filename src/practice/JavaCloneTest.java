package practice;

/**
 * @author 703238043 on Jul, 2020
 */

import java.util.Objects;

public class JavaCloneTest {

    public static void main(String args[]) {

        Rectangle rec = new Rectangle(30, 60);
        System.out.println("rec = " + rec);


        Rectangle copy = null;
        try {
            System.out.println("Creating Copy of this object using Clone method");
            copy = rec.clone();
            System.out.println("Copy = " + copy);

        } catch (CloneNotSupportedException ex) {

            ex.printStackTrace();
        }

        //testing properties of object returned by clone method in Java

        System.out.println("copy ! rec  :" + (copy != rec));
        System.out.println("copy.getClass() == rec.getClass() : " + (copy.getClass() == rec.getClass()));
        System.out.println("copy.equals(rec) : " + copy.equals(rec));
        //Updating fields in original object
       //rec.setHeight(100);
       //rec.setWidth(45);
            copy.setHeight(100);
            copy.setWidth(45);
        System.out.println("Original object :" + rec);
        System.out.println("Clonned object  :" + copy);
        System.out.println("Original object :" + rec);
        try {
            System.out.println("Creating Copy of this object using Clone method");
            copy = rec.clone();
            System.out.println("Copy = " + copy);

        } catch (CloneNotSupportedException ex) {

            ex.printStackTrace();
        }

    };

}

 class Rectangle implements Cloneable{
    private int width;
    private int height;

    public Rectangle(int w, int h){
        width = w;
        height = h;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public String toString(){
        return String.format("Rectangle [width: %d, height: %d]", width, height);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
