class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        int a =0;
        for(int i=0; i<N; i++){
            if(arr[i] == X){
                a = i;
                return a;
            }
        }
        
        return -1;
        
    }
    
}
