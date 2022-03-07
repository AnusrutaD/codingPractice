/* 
Write a recursive function that checks whether a string A is a palindrome 
or Not. Return 1 if the string A is palindrome, else return 0.

Note: A palindrome is a string that's the same when reads forwards and 
backwards.

Problem Constraints:

1 <= A <= 50000

String A consist only of lowercase letters.

Input Format:
First and only argument is a string A.

Output Format:
Return 1 if the string A is palindrome, else return 0.

Example Input:

Input 1:
A = "naman"

Input 2:
A = "strings"

Example Output:
Output 1:
1
Output 2:
0

Example Explanation:
Explanation 1:
"naman" is a palindomic string, so return 1.
Explanation 2:
"strings" is not a palindrome, so return 0.

 */

public class CheckPalindrome {
    public int solve(String A) {
        if(A.length() == 0){
            return 1;
        }
        StringBuffer mutableStr = new StringBuffer(A);
        if(mutableStr.length() == 1){
            mutableStr.deleteCharAt(0);
            return 1;
        }
        else if(mutableStr.charAt(0) == mutableStr.charAt(mutableStr.length() - 1) && mutableStr.length() > 1){
            // System.out.println(mutableStr);
            mutableStr.deleteCharAt(0);
            mutableStr.deleteCharAt(mutableStr.length() - 1);
            return solve(mutableStr.toString());
        }
        return 0;
    }
}
