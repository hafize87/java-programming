package day27_loops;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'l';
        int index = -1;

        for (int i = 0; i < word.length(); i ++){
         //   System.out.println(i + "-" + word.charAt(i));

            if(word.charAt(i) == letter){
                index = i;

                // System.out.println(letter + " is found at index " + index);    --> icindede yapabilirsin disndada
                break;  // exit for loop
            }

        }
        if(index == -1){
            System.out.println(letter + " is not present");
        }
        else{
            System.out.println(letter + " is found at index " + index);
        }
    }
}
