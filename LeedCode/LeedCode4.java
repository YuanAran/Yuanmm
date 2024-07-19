public class LeedCode4 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String s=strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<s.length()&&j<strs[i].length();j++){
                if(s.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            s=s.substring(0,j);
            if(s.equals("")){
                return "";
            }
        }
        return s;
    }

    public static void main(String[] args) {

         String s="sss";
        System.out.println(s.length());
    }
}
