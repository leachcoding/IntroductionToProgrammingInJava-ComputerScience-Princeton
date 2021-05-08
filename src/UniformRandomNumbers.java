public class UniformRandomNumbers {
    public static void main(String[] args) {
        double firstRandom = Math.random();
        double secondRandom = Math.random();
        double thirdRandom = Math.random();
        double fourthRandom = Math.random();
        double fifthRandom = Math.random();

        double[] randomValues;
        randomValues = new double[5];

        for (int i = 0; i < 5; i++) {
            randomValues[i] = Math.random();
        }

        System.out.println(randomValues);
    }
}
