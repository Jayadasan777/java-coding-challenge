//Question-https://leetcode.com/problems/count-and-say/submissions/1878716848/

package Day4;

public class countandsay {

    public String countAndSay(int n) {
        String result = "1";  
        for (int i = 2; i <= n; i++) {   
            String current = "";
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;  
                } else {
                    current = current + count + result.charAt(j - 1);
                    count = 1; 
                }
            }
             current = current + count + result.charAt(result.length() - 1);
            result = current;  
        }
        return result;
        
    }
}
    

