package mypractice;

public class Quizzes2 {
    public static void main(String[] args){

         String str ="the fox ran under the bridge";
         str = str.substring(4, 17);
         str.toUpperCase();
        System.out.println(str + "ground");  //  output = fox ran underground ==> uppercase kadedilmedigi icin cikmicak

        //---------------------------------------------------

        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);    // ===> "ame was tied at 2-2"

        int index1 = s.indexOf("game");   // ---> 4
        int index2 = s2.indexOf("game");   //  ---> -1

        if(index1 == index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }

        //--------------------------------------------------

        String ab = "ben gelim";
        String r = ab.substring(2);
        System.out.println(r);    // --> "n gelim"

        // ----------------------------------------------

        String z = "popcorn";
      //  z = z.substring(1,8);    --> 8 den az karakter oldugu icin "OutOfBounds" verecek

        if(z.equals("opcor")){
            System.out.println(z.length());
        }
        else{
            System.out.println(z.replace("o","a"));
        }

        //--------------------------------------------------

        String a = "today I will go to the beach";
        boolean b = a.contains("i");  // --> true
        boolean c = a.substring(12).startsWith("go");  // --> "bosluk"go to the beach. bosluk ile basladigindan false

        String result = b && c ? "go" : "don't go";
        System.out.println(result);   // --> "don't go"

        //-----------------------------------------------------------

        for(int i = 0; i< 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);   // output 1, 3, 5, 7, 9
        }

        //------------------------------------------------------------------

        int num = 5;
        while(num < 100){
        num += num;   // num = num + num
        }
        System.out.println(num);   // ---> 160

        //--------------------------------------------------------------------

        String word = "java";
        int a1 = 0;
        do{
            System.out.println(word.charAt(a1));
            a1++;
        }while (a1 > word.length());   // --> false oldugu icin bir kere yazdirip cikacak  output --> "j"


        // --------------------------------------------------------

//        String str1 = "The whole time it was raining";
//        do{
//            System.out.println(str1.charAt(0));   // output --> T o miw in
//            str1 = str1.substring(3);    // " whole time it was raining",  "ole time it var raining", " time it was raining", "me it was raining", "it was raining", "was raining", " raining", "ining", "ng"
//        }while (!str1.isEmpty());


        // --------------------------------------------------------------------------------

        String word1 = "I will find the lost book";
        String word2 = "";

        for (int i = word1.length()-1; i <= 0 ; i--) {   // loop dogru oladigi icin hic girmeden direk asagidakini cikarack
            word2 += word1.charAt(i);
        }
        System.out.println(word2);


        // ---------------------------------------------------------------------------------

        String x = "cybertek";

        for (int i = 0; i <= x.length(); i+=2) {
        //    System.out.println(x.charAt(i));    ----> cbre cikarip length yetmedigi icin sonunda OutOfBounds cikacak
        }

        // ------------------------------------------


        String input = "today it will be 100 degrees !";
        int n = 0;

        while (n++ < input.length()){
            if(n==8){
                continue;
            }
            else if( n== 9){
                break;
            }
            System.out.println(input.charAt(++n));  //  --> output = "dyi "
        }

        // ---------------------------------------------------------------------------

        int n1 = 2;
        int n2 = 6;

        int total = 0;

        for (int i = 0; i < 5; i++) {
            if(i % 3 == 0)
                continue;
                total += n1 + n2;

        }
        System.out.println(total);

        //---------------------------------------------------------------

        int count = 0;

        for (int i = 0; i < 4; i++) {
            if( i == 3) continue;
            for (int j = i+1; j <5; j++) {
                count++;
                if(j==3) break;
            }
        }
        System.out.println(count);   // 6


        //---------------------------------------------------

        String [] strs ={"display", "population", "meeting", "copy", "franchise"};

        int d1 = strs.length;
    //    int d2 = strs[5].length();  //  5 index olmadigi icin OutOfBounds diyecek ve output olmicak.

        System.out.println(a + " " + b);

        //------------------------------------------------------------------------



        int [] arr = {1, 3, 12, 5, 24, 7, 9, 10};
        boolean [] bArr = new boolean[arr.length];  // 8

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                bArr [i] = true;
            }
        }
        System.out.println(bArr);  //  false, false, true, false, true, false, false, true


        // -----------------------------------------------------------------

        int [] nums = {14, 1, 84, 97, 1243, 46};

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                sum += 5;
            }
            else{
                sum += 10;
            }
        }
        System.out.println(sum);  // output = 45



        // --------------------------------------------------------------


        String [] thing = {"house", "shed", "slide", "zebra", "park", "garden"};

        for(String y : thing){
            switch (y.charAt(1)){
                case 'h':
                    System.out.print(1);
                    break;
                case 'a':
                    System.out.print(2);
                case 's':
                    System.out.print(3);
                    break;
                case 'o':
                default:
                    System.out.print(4);
                case 'p':
                    System.out.print(5);
                    break;
                case 'z':
                    System.out.print(6);
                case'l':
                    break;
                case 'g':
                    System.out.print(7);
            }
        }

        String h = "Hafize Aksoy";
        System.out.println(h.substring(1,8));
    }
}
