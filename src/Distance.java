public class Distance {
    public static void main(String[] args) {
//        // print the Euclidean distance from (x,y) to origin (0,0). This can be represented by sqrt((x-a)^2 + (y-b)^2)
//
//        // x-a squared
//        int firstEuclidean = (Integer.parseInt(args[0]) - 0) * (Integer.parseInt(args[0]) - 0);
//
//        // y-a squared
//        int secondEuclidean = (Integer.parseInt(args[1]) - 0) * (Integer.parseInt(args[1]) - 0);
//
//        // sqrt of the two values
//        double euclideanDistance = Math.sqrt(firstEuclidean + secondEuclidean);
//
//        System.out.println(euclideanDistance);

        // print the Euclidean distance from (x,y) to (a,b). This can be represented by sqrt((x-a)^2 + (y-b)^2)

        // x-a squared
        int firstEuclidean = (Integer.parseInt(args[0]) - Integer.parseInt(args[2])) * (Integer.parseInt(args[0]) - Integer.parseInt(args[2]));

        // y-a squared
        int secondEuclidean = (Integer.parseInt(args[1]) - Integer.parseInt(args[3])) * (Integer.parseInt(args[1]) - Integer.parseInt(args[3]));

        // sqrt of the two values
        double euclideanDistance = Math.sqrt(firstEuclidean + secondEuclidean);

        System.out.println(euclideanDistance);
    }

}
