public class RightTriangle {
    public static void main(String[] args) {
        double sideA = Math.pow(Integer.parseInt(args[0]), 2);
        double sideB = Math.pow(Integer.parseInt(args[1]), 2);
        double sideC = Math.pow(Integer.parseInt(args[2]), 2);

        if ((sideA + sideB == sideC) && (Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[2]) > 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
