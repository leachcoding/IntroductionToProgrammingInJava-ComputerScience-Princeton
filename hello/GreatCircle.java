public class GreatCircle {
    public static void main(String[] args) {
        // command line latitude and longitude of two points
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double x2 = Math.toRadians(Double.parseDouble(args[1]));
        double y1 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double a = Math.pow(Math.sin((x2 - x1) / 2), 2)
                + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);

        // great circle distance in radians
        double angle2 = 2 * Math.asin(Math.min(1, Math.sqrt(a)));

        // convert back to degrees
        angle2 = Math.toDegrees(angle2);

        // each degree on a great circle of Earth is 60 nautical miles
        double distance2 = 60 * angle2;

        System.out.println(distance2 + " nautical miles");
    }
}
