class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        boolean []a=new boolean[26];
        char[]x=sentence.toCharArray();
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!=' ')
            {
                a[x[i]-97]=true;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(!a[i])
            {
                return false;
            }
        }
        return true;
        
    }
}