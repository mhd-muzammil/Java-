package basic;

public class Condition {
    public static void main(String[] args) {
        String day = "tuesday";
        String result = "";
        switch (day) {
            case "sunday","saturday"->result="10am";
            case "Monday"->result="5am";
            default -> result = "4am";
        }
        System.out.println(result);

    }

    
        
    }

