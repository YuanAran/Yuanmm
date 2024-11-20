package leedcode;

public class LeedCode11 {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){for(int j=0;j<needle.length();j++){
            if(haystack.charAt(i)==needle.charAt(j)){return i;}
        }
        }
        return -1;
    }
}
