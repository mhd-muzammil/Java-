class Calculator {
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) 
    {
        return n1 + n2;
    }

    public double add(double n1, int n2) 
    {
        return n1 + n2;
    }
}
public class Overload {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int sum = obj.add(333, 67766);
        System.out.println(sum);
    }
}
