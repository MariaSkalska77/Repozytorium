public class TriangleTest {

    public static void main(String[] args) {
        Triangle trojkat = new Triangle();

        int a = 3;
        int b = 4;
        int c = 10;
        boolean isRectangular = trojkat.isRectangular(a, b, c);
        System.out.println(isRectangular);


    }
}

