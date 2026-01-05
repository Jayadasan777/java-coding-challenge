//Question-https://leetcode.com/problems/reverse-string/description/
class Solution {
    public void reverseString(char[] s) {
        int left =0;
        int ryt =s.length-1;
        while(left < ryt)
        {
            char temp = s[left];
            s[left]=s[ryt];
            s[ryt]=temp;
            left ++;
            ryt--;
        }
        
    }
}
