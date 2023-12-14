class Solution {
    public boolean isPalindrome(int x) {
        String strX= Integer.toString(x) ;
        int n = strX.length();
        for(int i=0;i<n/2;i++){
            if(strX.charAt(i) != strX.charAt(n-1-i)){

                return false;
            }
        }
        return true;
    }
}
