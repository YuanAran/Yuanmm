public class LeedCode3 {
    public static void main(String[] args) {
    int a=125;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {
        if(x==0){return true;}
        if(x>0){
            String s=Integer.toString(x);
            char[] chars=s.toCharArray();
            char[] newChars=new char[chars.length];
            int k=chars.length-1;
            for(int i=0;i<chars.length;i++){
                newChars[i]=chars[k--];
            }
            if(s.equals(String.valueOf(newChars))){
                return true;
            }
        }
        return false;
    }
    //优解
//    public static boolean isPalindrome(int x) {
//        if(x < 0){
//            return false;
//        }
//        else{
//            int cur = 0;
//            int num = x;
//            while (num != 0){
//                cur = cur * 10 + num %10;
//                num /= 10;
//            }
//            return cur == x;
//        }
//    }
}
