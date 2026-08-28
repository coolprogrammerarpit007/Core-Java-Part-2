public class Demo4 {
    public static void main(String[] args) {
        // Upcasting

        // String s = "Hello";
        // Object obj = s;
        // System.out.println(obj); // Prints Hello

        // Downcasting
        // Object obj = "Hello";
        // String s = (String)obj;
        // System.out.println(s);


        //  Case3:- In this case downcasting can be dangerous
        Object obj = 10;
        String s = (String)obj;
        System.out.println(s); // will throw classCastException


    }
}
