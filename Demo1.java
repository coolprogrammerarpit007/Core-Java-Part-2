public class Demo1 {
    public static void main(String[] args) {
        // char[] arr = {'A','r','p','i','t',' ', 'M','i','s','h','r','a'};
        // String name = new String(arr);
        // String firstName = new String(arr,0,5);
        // System.out.println("User Name: " +  name);
        // System.out.println("User Name: " +  firstName);

        // StringBuilder and StringBuffer


        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        String greet = new String(sb);
        System.out.println(greet);


        // String Buffer
        StringBuffer sbuffer = new StringBuffer("Nice");
        System.out.println(sbuffer);
        String feel = new String(sbuffer);
        System.out.println(feel);
    }
}
