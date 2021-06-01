package officehours.practice_03_30_2021;

public class PrefixAgain {
    public static void main(String[] args) {

        String str = "abXYabc"; //  ab nin devaminda ab var mi?   1 deseydi a nin devaminda a varmi? gibi bakacaktik
        int n = 2;

        String prefix = str.substring(0,n); // 0, 2 -> ab
        String remaining = str.substring(n);  // XYabc

        System.out.println(remaining.contains(prefix));    // true
    }
}
