package concepts.oops;

import java.util.Objects;

/**
 * @author uttpal on Aug, 2020
 */
public class Geeks {

    String name;
    int id;


    public Geeks() {
        // TODO Auto-generated constructor stub
        System.out.println("from no arg constructor");
    }

    Geeks(String name, int id){
        System.out.println("from arg constructor");
        this.name=name;
        this.id=id;

    }


    public String toString(){

        return "id="+id+ ", name="+name;

    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geeks)) return false;
        Geeks geeks = (Geeks) o;
        return id == geeks.id &&
                name.equals(geeks.name);
    }*/
    /*public boolean equals(Object obj){


		if(!(obj instanceof Geeks)){
			return false;
		}
		Geeks geek=(Geeks)obj;
		System.out.println("from equals");

		if (!(obj instanceof Geeks))
			return false;
		if (obj == this)
			return true;
		return this.name.equals(((Geeks) obj).name) && this.name.equals(((Geeks) obj).name);
		//return geek.name==this.name && geek.id==this.id;
		//return false;
	}

	*/


    @Override
    public int hashCode() {
        return 1;
    }
}
