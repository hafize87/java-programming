package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {


        // BREAK statement

        for (int i = 1; i <=5; i++){
            System.out.print(i);
          //  break;  --> eger buraya break koyarsak sadece 1 kere calisacak

            if(i == 3){
                break;     // --> sadece 123 cikarip  break oldugu icin daha donmicek
            }

        }

        // OUTPUT:
        //  1, 2, 3


        System.out.println();


        for (int i = 1; i <= 5 ; i++) {

            if(i == 2 || i == 4){
                continue;      //  -- > go to next iteration . skip the code below. if statement dogru olsa bile calismaya devam edecek
            }                           // 5 kere donup sonra print edecek
            System.out.println(i);

        }   //OUTPUT :
        //             1, 3, 5





    }
}
