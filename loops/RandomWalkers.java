public class RandomWalkers {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            // Starting point is zero
            int x1 = 0;
            int y1 = 0;

            int x2 = 0;
            int y2 = 0;

            // Manhattan distance is the distance between two points measured along axes at right angles. (x1, y1) (x2, y2)  =>  |x1-x2| + |y1-y2|
            int r = Integer.parseInt(args[0]);
            int steps = 0;

            while (Math.abs(x1 - x2) + Math.abs(y1 - y2) != r) {
                double randomPercentange = Math.random();
                steps++;
                if (randomPercentange <= 0.25) {
                    y2++;
                } else if (randomPercentange <= 0.50 && randomPercentange > 0.25) {
                    x2++;
                } else if (randomPercentange <= 0.75 && randomPercentange > 0.50) {
                    y2--;
                } else {
                    x2--;
                }
            }
            totalSteps += steps;
        }

        double averageSteps = totalSteps / trials;

        System.out.println("average number of steps = " + averageSteps);
    }
}
