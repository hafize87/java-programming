package day50_inheritance;

public class AudioBook extends Book{

    int length;
    String narrator;

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }

    public void listen(){

        System.out.println("Listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("narrator = " + narrator);
        System.out.println("length = " + length);


    }
}
