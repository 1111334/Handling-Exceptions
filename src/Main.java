public class Main {
    public static void main(String[] args) {
        double[] testScore = {2.15, 50, 95.02, 100.01};
        for (double score : testScore) {
            try {
                checkscore(score);
            }catch (ArithmeticException error) {
                System.out.println(error.getMessage());
            }
        }
    }

    public static void checkscore(double score) {
        if (0 < score && score <= 50.00) {
            System.out.println("Average score");

        }else if (50.00 < score && score <= 100.00) {
            System.out.println("Very good score");

        }else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }

}

