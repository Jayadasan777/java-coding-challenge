package Day3;

public class IndexoftheFirstOccurrenceinaString {
    public int strStr(String haystack, String needle) {
        
  

        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {

            String part = haystack.substring(i, i + nLen);

            if (part.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
        
    
    

