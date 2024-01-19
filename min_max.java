
class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=Integer.MAX_VALUE;
        long max=-1*Integer.MAX_VALUE;
        
        for (int i=0; i<n; i++){
            if(a[i]<=min){
                min = a[i];
            }
            if(a[i]>=max){
                max = a[i];
            }
        }
        
        Pair x = new Pair(min,max);
        
        return x;
    }
}
