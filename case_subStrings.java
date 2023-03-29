class Solution 
{ 
    
    int countSubstring(String S) 
    { 
        // code here
        int n = S.length();
        String subeql[] = new String[n*n];
        int k=0;
        for ( int i=0;i<n;i++){
            int ucount=0,lcount=0;
            for (int j=i;j<n;j++){
                if(Character.isUpperCase(S.charAt(j)))
                ucount++;
                else
                lcount++;
                if(ucount==lcount)
                 {subeql[k] = S.substring(i,j+1);
                 k++;}
            }
        }
        return k;
    }
} 
