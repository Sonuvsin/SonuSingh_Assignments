public class armstrong {
    public static void main(String[] args) {

        int n = 153, Number, remainder, result = 0;

        Number = n;

        while (Number != 0) {
            remainder = Number % 10;
            result += Math.pow(remainder, 3);
            Number /= 10;
        }

        if (result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
