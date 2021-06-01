package day48_constructors_static;

public class Customer {

    private String name;
    private int id;


    // no_args Constructor
    public Customer(){
        System.out.println("No_args constructor");
        name = "new costumer";
        id = -1;
    }

    // add constructor with param
    public Customer(String name, int id){
        System.out.println("2 args constructor");

        this.name = name;   // setName(name);  we can do 2. way  genelde condition olunca yaziliyor method ismi
        this.id = id;      // setId(id);    2. way

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
