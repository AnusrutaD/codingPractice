/*
Problem Description

        Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
        compute how much water it is able to trap after raining.

        Problem Constraints

        1 <= |A| <= 100000

        Input Format

        First and only argument is the vector A

        Output Format

        Return one integer, the answer to the question

        Example Input

        Input 1:

        A = [0, 1, 0, 2]
        Input 2:

        A = [1, 2]

        Example Output

        Output 1:

        1
        Output 2:

        0

        Example Explanation

        Explanation 1:

        1 unit is trapped on top of the 3rd element.
        Explanation 2:

        No water is trapped.

 */

public class RainWaterTrapped {
    public int trap(final List<Integer> A) {
        int size = A.size();
        int lMax[] = new int[size];
        int rMax[] = new int[size];
        int sum = 0;
        lMax[0] = A.get(0);
        rMax[size - 1] = A.get(size - 1);
        for(int i = 1; i < size; i++){
            lMax[i] = Math.max(lMax[i - 1], A.get(i));
            rMax[size - i - 1] = Math.max(rMax[size - i], A.get(size - i - 1));
        }
        for(int i = 0; i < size; i++){
            sum += (Math.min(lMax[i], rMax[i]) - A.get(i));
        }
        return sum;
    }
}