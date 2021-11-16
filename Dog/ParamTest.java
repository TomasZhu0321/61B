public class ParamTest {
    public static void main(String[] args) {
        ParamTest pt = new ParamTest();
        int i = 10;
        pt.pass(i);
        System.out.println("print in main , i is " + i);
    }

    public void pass(int j) {
        j = 20;
        System.out.println("print in main , j is " + j);
    }
}