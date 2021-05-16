public class CMYKtoRGB {
    public static void main(String[] args) {
        //args is black
        double white = 1 - Double.parseDouble(args[3]);

        //args is cyan
        double red = 255 * white * (1 - Double.parseDouble(args[0]));

        //args is magenta
        double green = 255 * white * (1 - Double.parseDouble(args[1]));

        //args is yellow
        double blue = 255 * white * (1 - Double.parseDouble(args[2]));

        int n = 123456789;
        int m = 0;
        while (n != 0) {
            m = (10 * m) + (n % 10);
            n = n / 10;
        }


        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));

        return m;
    }
}
