//this file consists brute-force as well as optimal approach to find the three sum
//optimal approach is the solution for leetcode problem number 15

package Arrays.TwoPointer;

import java.util.*;

class ThreeSum {

    // ==============================
    // BRUTE FORCE APPROACH
    // TC: O(n^3)
    // ==============================
    public static List<List<Integer>> bruteForce(int[] a) {

        int n = a.length;

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate i
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 1; j++) {

                // Skip duplicate j
                if (j > i + 1 && a[j] == a[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < n; k++) {

                    // Skip duplicate k
                    if (k > j + 1 && a[k] == a[k - 1]) {
                        continue;
                    }

                    int sum = a[i] + a[j] + a[k];

                    if (sum == 0) {

                        List<Integer> list = new ArrayList<>();

                        list.add(a[i]);
                        list.add(a[j]);
                        list.add(a[k]);

                        res.add(list);
                    }
                }
            }
        }

        return res;
    }


    // ==============================
    // OPTIMAL APPROACH
    // TC: O(n^2)
    // ==============================
    public static List<List<Integer>> optimal(int[] a) {

        int n = a.length;

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate i
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = a[i] + a[j] + a[k];

                if (sum == 0) {

                    List<Integer> list = new ArrayList<>();

                    list.add(a[i]);
                    list.add(a[j]);
                    list.add(a[k]);

                    res.add(list);

                    j++;
                    k--;

                    // Skip duplicate j
                    while (j < k && a[j] == a[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && a[k] == a[k + 1]) {
                        k--;
                    }

                } 
                else if (sum > 0) {
                    k--;
                } 
                else {
                    j++;
                }
            }
        }

        return res;
    }


   
    public static void main(String[] args) {

        int[] a = {-1, 0, 2, 0, -1, -1, 3, 2, 0, 1};

        System.out.println("Brute Force: " + bruteForce(a));

        System.out.println("Optimal: " + optimal(a));
    }
}