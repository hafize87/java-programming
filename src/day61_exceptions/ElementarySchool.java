package day61_exceptions;

public class ElementarySchool {

    private String name ;
    private int age;

    public ElementarySchool(){

    }

    public ElementarySchool(String name, int age) {
       setName(name);
       setAge(age);

    }

    @Override
    public String toString() {
        return "ElementarySchool{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        // check if name is null first, otherwise we might get nullPointer exception
        if(name == null || name.isEmpty()){

            throw new IllegalArgumentException("Name cannot be empty");

        }
        // if names is all numbers, or starts with number  --> bu sekilde conditions larda ekliyebiliriz.
        // else kullanmaya gerek yok zaten yanlis veririse asagiya gecmicek
            this.name = name;


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 5 || age > 12){
           throw new IllegalArgumentException("Age cannot be < 5 0r > 12");
        }
            this.age = age;


    }
}
