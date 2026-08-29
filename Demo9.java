public class Demo9 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.value = 5;
        b1.printDouble(); // it gives double value of any integer data type means int,float,long all converted to double
    }
}
// Generics --> T can be anything
// Bounds in Generics
// Upper bound --> T is atleast Number or its subtype

class Box<T extends Number> {
    T value;

    public void printDouble() {
        System.out.println(this.value.doubleValue());
    }
}