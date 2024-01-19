class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        
        int sum = 0;
        int sum1 = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        
        for(int i=0 ; i<n-1; i++){
            sum1+=array[i];
        }
        
        return sum-sum1;
        
    }
}
