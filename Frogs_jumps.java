class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int vtdLeaves[] = new int[leaves+1];
        int notvisited =0;
        for( int i =0; i < N; i++){
            int j =1;
            if(frogs[i]==1)
            return 0;
            if(frogs[i]<=leaves&&vtdLeaves[frogs[i]]==0){
            while(frogs[i]*j<= leaves ){
                vtdLeaves[frogs[i]*j]=1;
                j++;
            }}
        }
        for( int i=1;i<vtdLeaves.length; i++){
            if(vtdLeaves[i]==0){
                notvisited++;
            }
        }
        return notvisited;
    }
}
