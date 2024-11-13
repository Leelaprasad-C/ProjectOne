
public class HelloWorld {

    int i;
    int j;

    public HelloWorld(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int addSum() {
        return i + j;

    }

    public static void main(String args[]) {
        System.out.println("HelloWorld!");
        HelloWorld hw = new HelloWorld(10, 20);
        System.out.println("sum : " + hw.addSum());
    }

}
