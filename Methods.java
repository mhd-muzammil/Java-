class Computer {
    void playMusic() {
        System.out.println("Music is playing...");
    }

    public String GetMeAPen(int cost) {
        if (cost >= 10) 
            return "pen";
        else 
            return "Nothing";
    }
}
public class Methods {
    public static void main(String a[]) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.GetMeAPen(10);
        System.out.println(str);
    }
}
