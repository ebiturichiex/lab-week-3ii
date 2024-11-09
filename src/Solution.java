//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int testValue = 100;
        boolean result = solution.isPowerOfTen(testValue);
        System.out.println(testValue + " is a power of ten: " +result);
    }
            public boolean isPowerOfTen(int n) {
                // Powers of ten are positive and can be checked by repeated division
                if (n <= 0) {
                    return false;
                }

                while (n % 10 == 0) {
                    n /= 10;
                }

                return n == 1;
            }
        }

