
public class HelloWorld {

    int i;
    int j;

    public HelloWorld(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public HelloWorld() {

    }

    public int addSum() {
        return i + j;

    }

    public int addSum(int i, int j) {
        return i + j;

    }

    public static void main(String args[]) {
        System.out.println("HelloWorld!");
        HelloWorld hw1 = new HelloWorld(10, 20);
        HelloWorld hw2 = new HelloWorld();

        System.out.println("Sum Case 1 : " + hw1.addSum());
        System.out.println("sum Case 2 : " + hw2.addSum(20, 30));

    }

}
