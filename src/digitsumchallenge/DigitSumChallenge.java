package digitsumchallenge;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigis(125));
        System.out.println("The sum of the digits in number 125 is " + sumDigis(-125));
        System.out.println("The sum of the digits in number 125 is " + sumDigis(4));
        System.out.println("The sum of the digits in number 125 is " + sumDigis(32123));
        
    }

    private static int sumDigis(int number) {
        
        if (number < 10){
            return -1;
        }
        
        int sum = 0;
        
        // 125 --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 - 120 = 5
        while (number > 0){
            // extract the lest-significant digit
            int digit = number % 10;
            sum += digit;
            
            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
