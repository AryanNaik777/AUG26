package Assignment;

public class number_pattern {
    public static void main(String[] args) {
        int num1 = 1;
        for (int n = 1; n <= 3; n++) {
            for (int b = 1; b <= n; b++) {
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
        }
    }
}
