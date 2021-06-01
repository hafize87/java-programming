package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

//        "starting: World's smallest cat 🐈- BBC"
//
//        int seconds = 0;
//
//        video is 1 min 57 seconds
//
//        while we did not reach to last second
//        print " Watching YouTube video: second: 1"
//
//          print "Finished watching Cat video, lets start another one"

          System.out.println("starting: World's smallest cat 🐈- BBC");

        int second = 0;
        while (second <= 117){
            System.out.println("Watching cat at second " + second);
            second++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat video, lets start another one");



    }
}
