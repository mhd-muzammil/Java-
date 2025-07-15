package basic;

public class Logical {
    public static void main(String[] args) 
    {
        //AND staatement
        int a = 7;
        int b = 5;
        int x = 6;
        int y = 9;

        boolean result = a > b && x > y;
        System.out.println(result);

        //OR statement

        int p = 7;
        int q = 5;
        int r = 6;
        int s = 9;

        boolean resultt = p > q || r > s;
        System.out.println(resultt);

        //NOT 
        
        int c = 7;
        int d = 5;
        boolean rresult = c > d;
        System.out.println(!rresult);

    }
}
