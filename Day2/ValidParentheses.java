package Day2;

//https://leetcode.com/problems/valid-parentheses/description/
class ValidParentheses {
    public boolean isValid(String s) {
        while(s.contains("()")||s.contains("[]")||s.contains("{}"))
        {
            s=s.replace("()","");
          s=s.replace("[]","");
            s=s.replace("{}","");
            
        }
        return s.length()==0;
        
    }
}