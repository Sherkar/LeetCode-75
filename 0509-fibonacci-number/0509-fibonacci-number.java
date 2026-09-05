class Solution {
    public int fib(int n) {
        //Base Case
        if(n<=1){
            return n;
        }
        //Initialize our memoization map
        int[] map=new int[n+1];
        
        //ours base cases
        map[0]=0;
        map[1]=1;
        //WE iterate through remaning  values (2...N)
for(int i=2;i<=n;i+=1){
    map[i]=map[i-1]+map[i-2];
}
return map[n];


    }
}