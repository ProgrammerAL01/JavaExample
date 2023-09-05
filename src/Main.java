public class Main {
    public static void main(String[] args) {
        int number = 789;
        int reversNumber = 0;
        int remainder;
        while (number !=  0) {
            remainder = number / 10;
            reversNumber = reversNumber * 10 + remainder;
            number /= 10;
        }
        System.out.println("Reversed Number is" + reversNumber);
    }
}