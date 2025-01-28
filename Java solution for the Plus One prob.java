 Java solution for the Plus One problem:

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit and handle the carry
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // No carry needed, just increment and return
                return digits;
            }
            // If digit is 9, set it to 0 and continue the carry
            digits[i] = 0;
        }

        // If the loop completes, all digits were 9. Create a new array
        int[] result = new int[n + 1];
        result[0] = 1; // Carry overflows to a new most significant digit
        return result;
    }

    // Example Usage
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}

2 Given a string s consisting of words and spaces, return the length of the last word in the string
class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces from the string
        s = s.trim();
        
        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Calculate the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }
}


3 Merge nums1 and nums2 into a single array sorted in non-decreasing order.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int p1 = m - 1; // Last element in nums1
        int p2 = n - 1; // Last element in nums2
        int p = m + n - 1; // Last position in nums1

        // Compare elements from the end of both arrays and place the larger one at the current position
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Copy any remaining elements from nums2 (if any)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        // No need to copy remaining elements from nums1 as they are already in place
    }
}


4 Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: if prices array is empty or has only one day
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE; // Track the minimum price
        int maxProfit = 0;               // Track the maximum profit
        
        for (int price : prices) {
            // Update the minimum price so far
            if (price < minPrice) {
                minPrice = price;
            }
            
            // Calculate the profit and update the maximum profit
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        
        return maxProfit;
    }
}

