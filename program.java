public class program {

    int nummer;

    public program(int input) {
        nummer = input;
    }

    public int multiply(int mult) {

        int number;
        number = nummer * mult;
        return number;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        program programma = new program(5);
        System.out.println(programma.nummer);
        System.out.println(programma.multiply(8));
    }

}