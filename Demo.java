public class Demo {

    public static void main(String[] args) {
        // String s1 = "Hello";
        // // String s2 = s1.concat(" World!");
        // // System.out.println(s2);
        // String s3 = "Hello";
        // System.out.println(s1==s3);

        // String s4 = new String("Aditya");
        // String s5 = new String("Aditya");
        // System.out.println(s4 == s5);

        String s = "";
        for(int i=0;i<=5;i++)
        {
            s+=i;
            // System.out.println(s);
        }
        System.out.println(s);
        
    }
}


// Problem of Immutablity -> String builder and String buffer solve this problem of Immuatblity 