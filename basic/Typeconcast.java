
package basic;
public class Typeconcast{
    public static void main(String[] args) {
        //type conversions

        //Java does this automatically when you're moving small to big.

        int num = 10;
        double bigNum = num;

        //num is an int (medium box).
        //bigNum is a double (big box).
        //Java says: “Oh! You’re moving a small number to a bigger box — I got this.” ✅
        //🔄 It's like:
        //Putting a cup of water into a bucket — no problem!
        System.out.println(bigNum);

        //type casting

        //Java needs your help when you're moving big to small.
        //Java says: “Wait! You're trying to put a big value in a smaller box — you might lose some data! Do it only if you're sure.”

        double pi = 3.14;
        int a = (int) pi;

        //(int) tells Java: “I know what I’m doing. Chop off the decimal.”
        //Result: num = 3 (it cuts off .14)

        System.out.println(a);

    }
}
