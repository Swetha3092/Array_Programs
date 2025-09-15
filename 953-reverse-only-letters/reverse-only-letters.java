class Solution {
    public String reverseOnlyLetters(String s) {
        char[]a=s.toCharArray();
        int l=0,r=a.length-1;
        while(l<r)
        {
            if(isletter(a[l],a[r]))
            {
                char temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
            else if(!Character.isLetter(a[l]))
            {
                l++;
            }
            else if(!Character.isLetter(a[r]))
            {
                r--;
            }
        }
        return new String(a);
        
    }
    public static boolean isletter(char l, char r)
    {
        return Character.isLetter(l) && Character.isLetter(r);
    }
}