package conditionals_loops03.leetadded;

/***
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 *
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 */
public class subtractProductAndSumLeet {
    public static void main(String[] args) {
        int n = 234;

    }
    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;
        while (n != 0){
            product *= n/10;
            sum += n/10;
            n = n/10;
        }

        return product - sum;

    }
}
